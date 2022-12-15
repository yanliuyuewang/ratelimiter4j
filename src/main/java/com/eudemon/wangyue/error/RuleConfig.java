package com.eudemon.wangyue.error;

import java.util.List;

/**
 * wangyue
 * 2022/12/14 ： 20:06
 */
public class RuleConfig {
    private  AppRuleConfig  configs ;

    public AppRuleConfig getConfigs() {
        return configs;
    }

    public void setConfigs(AppRuleConfig configs) {
        this.configs = configs;
    }

    //    private List<AppRuleConfig> configs;
//
//    public List<AppRuleConfig> getConfigs() {
//        return configs;
//    }
//
//    public void setConfigs(List<AppRuleConfig> configs) {
//        this.configs = configs;
//    }

    public static class AppRuleConfig {
        private String appId;
        private List<ApiLimit> limits;

        public AppRuleConfig() {
        }


        public AppRuleConfig(String appId, List<ApiLimit> limits) {
            this.appId = appId;
            this.limits = limits;
        }
    }

    @Override
    public String toString() {
        return "RuleConfig{" +
                "configs=" + configs +
                '}';
    }
}
