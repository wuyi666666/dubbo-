package org.example.service.impl;

import org.example.service.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String hello) {
        return "收到：" + hello;
    }
}
