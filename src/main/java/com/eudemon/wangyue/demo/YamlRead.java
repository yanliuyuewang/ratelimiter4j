package com.eudemon.wangyue.demo;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

/**
 * wangyue
 * 2022/12/14 ： 21:17
 */
public class YamlRead {

    public static void main(String[] args) {
        testParse();

//————————————————
//        版权声明：本文为CSDN博主「Ricky_Fung」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//        原文链接：https://blog.csdn.net/top_code/article/details/55101219


    }

    public static void testParse(){

        Yaml yaml = new Yaml();
        try {
            InputStream in = YamlRead.class.getResourceAsStream("/sample.yaml");
            Configuration config = yaml.loadAs(in, Configuration.class );
            System.out.println(config);
        } catch (Exception e){
            e.printStackTrace();
        }

    }






}
