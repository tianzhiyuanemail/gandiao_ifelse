package com.example.gandiao_ifelse.util;/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
/**
9
 * 获取Spring容器中bean工具类
10
 * @author ZENG.XIAO.YAN
11
 * @date   2018年6月6日
12
 * 
13
 */
@Component("springContextUtils")
public class SpringContextUtils implements ApplicationContextAware {
    private static ApplicationContext applicationContext = null;
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    @SuppressWarnings("unchecked")
    public static <T> T getBean(String beanId) {
        return (T) applicationContext.getBean(beanId);
    }
    public static <T> T getBean(Class<T> requiredType) {
        return (T) applicationContext.getBean(requiredType);
    }
    /**
33
     * Spring容器启动后，会把 applicationContext 给自动注入进来，然后我们把 applicationContext 赋值到静态变量中，方便后续拿到容器对象
34
     * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
35
     */
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtils.applicationContext = applicationContext;
    }
}