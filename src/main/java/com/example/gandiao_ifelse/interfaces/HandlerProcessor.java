/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.example.gandiao_ifelse.interfaces;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import com.example.gandiao_ifelse.handle.HandlerContext;

@Component
public class HandlerProcessor implements BeanFactoryPostProcessor {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory)
            throws BeansException {
        Map<String,Class> map = new HashMap<>();

        // 获取所有被注解的类的集合
        Map<String, Object> beansWithAnnotation =
                configurableListableBeanFactory.getBeansWithAnnotation(HandlerType.class);

        // 获取 注解类上的值
        beansWithAnnotation.values().forEach(c->{
            String value = c.getClass().getAnnotation(HandlerType.class).value();
            map.put(value,c.getClass());
        });

        //将对象注册到容器中
        HandlerContext handlerContext = new HandlerContext(map);
        configurableListableBeanFactory.registerSingleton("handlerContext",handlerContext);
    }
}
