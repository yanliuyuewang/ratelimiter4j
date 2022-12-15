package com.eudemon.wangyue.demo;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * wangyue
 * 2022/12/14 ： 21:16
 */
public class Configuration {

    private Date released;
    private String version;
    private Connection connection;
    private List<String> protocols;
//    private List<Limit> protocols;
    private Map<String, String> developers;

    public Date getReleased() {
        return released;
    }

    public void setReleased(Date released) {
        this.released = released;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public List<String> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }


    public Map<String, String> getDevelopers() {
        return developers;
    }

    public void setDevelopers(Map<String, String> developers) {
        this.developers = developers;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "released=" + released +
                ", version='" + version + '\'' +
                ", connection=" + connection +
                ", protocols=" + protocols +
                ", developers=" + developers +
                '}';
    }

//————————————————
//    版权声明：本文为CSDN博主「Ricky_Fung」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/top_code/article/details/55101219



}
