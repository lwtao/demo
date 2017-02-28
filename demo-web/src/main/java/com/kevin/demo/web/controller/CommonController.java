/******************************************************************************
 * Copyright (C) 2013 - 2017 ShenZhen oneplus Technology Co.,Ltd All Rights Reserved.
 * 本软件为深圳万普拉斯科技有限公司开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件 .
 *****************************************************************************/
package com.kevin.demo.web.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

/**
 * @author liuwentao
 * @history 2017/2/28 liuwentao 新建
 * @since 2017/2/28 9:30
 */
@RequestMapping("/common")
@Controller
public class CommonController {

    @Resource
    private Producer captchaProducer;

    @RequestMapping("/captcha.jpg")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // Set to expire far in the past.
        response.setDateHeader("Expires", 0);
        // Set standard HTTP/1.1 no-cache headers.
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        // Set IE extended HTTP/1.1 no-cache headers (use addHeader).
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        // Set standard HTTP/1.0 no-cache header.
        response.setHeader("Pragma", "no-cache");

        // return a jpeg
        response.setContentType("image/jpeg");

        // create the text for the image
        String capText = captchaProducer.createText();

        // store the text in the session
        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);

        // create the image with the text
        BufferedImage bi = captchaProducer.createImage(capText);

        ServletOutputStream out = response.getOutputStream();

        // write the data out
        ImageIO.write(bi, "jpg", out);
        try {
            out.flush();
        }
        finally {
            out.close();
        }
        return null;
    }

    /**
     * 验证验证码
     * 
     * @param kaptchaReceived
     * @param request
     * @return
     */
    private String x(String kaptchaReceived, HttpServletRequest request) {
        // 用户输入的验证码的值
        String kaptchaExpected = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        // 校验验证码是否正确
        if (kaptchaReceived == null || !kaptchaReceived.equals(kaptchaExpected)) {
            return "kaptcha_error";// 返回验证码错误
        }
        return null;
    }

}