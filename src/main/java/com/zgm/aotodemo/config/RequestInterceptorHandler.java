package com.zgm.aotodemo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class RequestInterceptorHandler extends HandlerInterceptorAdapter {

    private final static Logger logger = LoggerFactory.getLogger(RequestInterceptorHandler.class);



    /**
     * TODO 在请求处理之前进行调用（Controller方法调用之前）
     * 基于URL实现的拦截器
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "*");
        response.addHeader("Access-Control-Max-Age", "100");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        response.addHeader("Access-Control-Allow-Credentials", "false");
        // Servlet请求路径
        String servletPath = request.getServletPath();
        logger.info("当前访问路径="+servletPath);
        // 是否需要验证签名
        return true;
    }




}