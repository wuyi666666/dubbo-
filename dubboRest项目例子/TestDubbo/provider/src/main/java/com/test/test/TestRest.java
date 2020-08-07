package com.test.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestRest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read();
    }
}
