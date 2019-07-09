/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.example.gandiao_ifelse.handle;

import org.springframework.boot.context.properties.bind.AbstractBindHandler;
import org.springframework.stereotype.Component;

import com.example.gandiao_ifelse.interfaces.HandlerType;

@HandlerType("1")
@Component
public class OneHandle extends AbstractHandler {
    @Override
    public void a() {
        System.out.println(1);
    }
}
