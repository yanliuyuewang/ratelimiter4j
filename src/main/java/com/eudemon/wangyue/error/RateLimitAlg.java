package com.eudemon.wangyue.error;

import com.eudemon.ratelimiter.exception.InternalErrorException;
import com.google.common.base.Stopwatch;
import org.apache.curator.shaded.com.google.common.annotations.VisibleForTesting;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * wangyue
 * 2022/12/14 ： 20:12
 */
public class RateLimitAlg {

    /* timeout for {@code Lock.tryLock() }. */
    private static final long TRY_LOCK_TIMEOUT = 200L; // 200ms.
    private Stopwatch stopwatch;
    private AtomicInteger currentCount = new AtomicInteger(0);
    private final int limit;
    private Lock lock = new ReentrantLock();

    public RateLimitAlg(int limit) {
        this(limit, Stopwatch.createStarted());
    }

    @VisibleForTesting
    protected RateLimitAlg(int limit, Stopwatch stopwatch) {
        this.limit = limit;
        this.stopwatch = stopwatch;
    }

    public boolean tryAcquire() throws InternalErrorException {
        int updatedCount = currentCount.incrementAndGet();
        if (updatedCount <= limit) {
            return true;
        }
        try {
            if (lock.tryLock(TRY_LOCK_TIMEOUT, TimeUnit.MILLISECONDS)) {
                try {
                    if (stopwatch.elapsed(TimeUnit.MILLISECONDS) > TimeUnit.SECONDS.toMillis(1)) {
                        currentCount.set(0);
                        stopwatch.reset();
                    }
                    updatedCount = currentCount.incrementAndGet();
                    return updatedCount <= limit;
                } finally {
                    lock.unlock();
                }
            } else {
                throw new InternalErrorException("tryAcquire() wait lock too long:" + TRY_LOCK_TIMEOUT + "ms");
            }
        } catch (InterruptedException e) {
            throw new InternalErrorException("tryAcquire() is interrupted by lock-time-out.", e);
        }
    }
}
