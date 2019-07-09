/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.example.gandiao_ifelse.test;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gandiao_ifelse.service.Services;

@RestController
public class TestMain {

    @Resource
    private Services services;

    @RequestMapping("/test")
    public void contextLoads(String type) throws Exception {
        services.s(type);

    }
}
