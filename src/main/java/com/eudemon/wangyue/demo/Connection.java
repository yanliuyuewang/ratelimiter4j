package com.eudemon.wangyue.demo;

/**
 * wangyue
 * 2022/12/14 ： 21:16
 */
public class Connection {

    private String driverClass;
    private String url;
    private String username;
    private String password;
    private int poolSize;

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }
//————————————————
//    版权声明：本文为CSDN博主「Ricky_Fung」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/top_code/article/details/55101219
}
