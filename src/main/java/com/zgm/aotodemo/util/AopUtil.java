package com.zgm.aotodemo.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import javax.servlet.http.HttpServletRequest;

public class AopUtil {


    /**
     * TODO 切面中封装请求参数到JMap中
     */
    public static JMap paraseParam(ProceedingJoinPoint pjp) throws Exception {
        MethodSignature signature = ((MethodSignature) pjp.getSignature());
        // 获取方法参数名
        String[] paramNames = signature.getParameterNames();
        // 获取参数值
        Object[] paramValues = pjp.getArgs();

        JMap paramMap = JMap.create();
        for (int i = 0; i < paramNames.length; i++) {
            if (paramValues[i] instanceof HttpServletRequest) {
                String addressIp = RequestUtil.getIpAddr((HttpServletRequest) paramValues[i]);
                paramMap.put("addressIp", addressIp);
                continue;
            }
            paramMap.put(paramNames[i], paramValues[i]);
        }
        return paramMap;
    }




}