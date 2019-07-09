/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.example.gandiao_ifelse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gandiao_ifelse.handle.AbstractHandler;
import com.example.gandiao_ifelse.handle.HandlerContext;

@Service
public class ServiceImpl implements Services {

    @Autowired
    HandlerContext handlerContext;

    @Override
    public void s(String type) throws Exception {
        AbstractHandler instance = handlerContext.getInstance(type);

        instance.a();
    }
}
