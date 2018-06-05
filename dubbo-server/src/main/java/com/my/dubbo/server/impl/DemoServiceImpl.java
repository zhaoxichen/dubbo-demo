package com.my.dubbo.server.impl;

import com.my.dubbo.server.DemoService;

public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        System.out.println("init : " + name);
        return "hello " + name;
    }
}
