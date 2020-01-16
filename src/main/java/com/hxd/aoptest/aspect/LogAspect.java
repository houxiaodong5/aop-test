package com.hxd.aoptest.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
public class LogAspect {


    private static Logger logger=LoggerFactory.getLogger(LogAspect.class);

    /**
     *  定义切入点
     * */

    //@Pointcut("execution(* com.hxd.aoptest..*.*(..))")
    @Pointcut("execution(* com.hxd.aoptest.controller.*.*(..))")
    public void pointcup(){}

    /**
     * 前置通知
     * */
    @Before("pointcup()")
    public void doBefore(JoinPoint joinPoint) throws Throwable{
        //接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //记录请求内容
        logger.info("URL："+request.getRequestURI());
        logger.info("HTTP_METHOD："+request.getMethod());
        logger.info("IP："+request.getRemoteAddr());
        logger.info("CLASS_METHOD："+joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        logger.info("ARGS："+ Arrays.toString(joinPoint.getArgs()));

    }

    /**
     *  后置通知
     *
     * */
    @AfterReturning(pointcut = "pointcup()",returning = "rst")
    public void doAfter(ResponseEntity rst)throws Throwable{
        String result = JSON.toJSONString(rst.getBody());
        if(result.length()<=100){
            logger.info("RESPONSE："+ result);
        }

        logger.info("RESPONSE CODE："+rst.getStatusCode().toString());
    }




}
