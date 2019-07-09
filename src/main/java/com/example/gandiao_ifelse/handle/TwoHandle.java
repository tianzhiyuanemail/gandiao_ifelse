/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.example.gandiao_ifelse.handle;

import org.springframework.stereotype.Component;

import com.example.gandiao_ifelse.interfaces.HandlerType;

@HandlerType("2")
@Component
public class TwoHandle extends AbstractHandler {
    @Override
    public void a() {
        System.out.println(222);
    }
}
