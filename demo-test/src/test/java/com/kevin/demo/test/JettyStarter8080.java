/**
 * Copyright (C) 2013-2015 一加科技
 */
package com.kevin.demo.test;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.net.URL;

/**
 * jetty启动器
 * 
 * @author ZhouJun 创建日期: 2015年12月30日 上午10:22:43 开发环境: JDK1.7
 */
public class JettyStarter8080 {

    private int port = 8080;

    private String contextPath = "/";

    private String appName = "demo";

    public void start() throws Exception {
        URL url = getClass().getClassLoader().getResource("logback-test.xml");
        String pwd = StringUtils.substringBefore(url.getPath(), "/target/test-classes");

        String webapp = pwd + "\\..\\" + appName + "-web\\src\\main\\webapp";
        WebAppContext context = new WebAppContext(webapp, contextPath);
        context.setParentLoaderPriority(true);
        context.getInitParams().put("org.eclipse.jetty.servlet.Default.useFileMappedBuffer", "false");

        Server server = new Server(port);
        server.setHandler(context);
        server.start();
        server.join();
    }

    public static void main(String[] args) throws Exception {
        JettyStarter8080 starter = new JettyStarter8080();
        starter.start();
    }
}
