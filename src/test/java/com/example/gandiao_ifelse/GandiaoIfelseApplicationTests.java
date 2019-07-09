package com.example.gandiao_ifelse;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.gandiao_ifelse.service.Services;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GandiaoIfelseApplicationTests {

    @Resource
    private Services services;
    @Test
    public void contextLoads() throws Exception {
        services.s("1");

    }

}
