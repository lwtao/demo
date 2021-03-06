package com.kevin.demo.test;

import org.apache.catalina.startup.Tomcat;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.net.URL;

public class TomcatStarter {

    private int port = 9780;

    private String contextPath = "/";

    public void start() throws Exception {
        Tomcat tomcat = new Tomcat();
        URL url = getClass().getClassLoader().getResource("logback-test.xml");
        String pwd = StringUtils.substringBefore(url.getPath(), "/target/test-classes");
        tomcat.setBaseDir(pwd);
        tomcat.setPort(port);

        StringBuilder webAppBuilder = new StringBuilder();
        webAppBuilder.append(pwd).append(File.separator).append("..").append(File.separator).append("demo-web/src/main/webapp");
        String webapp = webAppBuilder.toString();

        tomcat.addWebapp(contextPath, webapp);
        tomcat.enableNaming();
        tomcat.start();
        tomcat.getServer().await();
    }

    public static void main(String[] args) throws Exception {
        TomcatStarter starter = new TomcatStarter();
        starter.start();
    }

}