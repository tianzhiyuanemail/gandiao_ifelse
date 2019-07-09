/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.example.gandiao_ifelse.handle;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.gandiao_ifelse.util.SpringContextUtils;


public class HandlerContext {

    private Map<String,Class> handlerMap;

    public HandlerContext(Map<String, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }
    public HandlerContext() {

    }

    public AbstractHandler getInstance(String type) throws Exception {
        Class c = handlerMap.get(type);
        if (c == null){
            throw new Exception();
        }

        Object bean = SpringContextUtils.getBean(c);

        return (AbstractHandler)bean;
    }


}
