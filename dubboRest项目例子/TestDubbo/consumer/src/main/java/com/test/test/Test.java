package com.test.test;

import com.test.callback.Notify;
import com.test.callback.impl.NotifyImpl;
import com.test.wy.RestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        RestService restService = context.getBean("RestService", RestService.class);
        String user = restService.getUser(666);
        System.out.println(user);
        NotifyImpl demoCallback = context.getBean("demoCallback", NotifyImpl.class);
        while(demoCallback.map.size()!=2){
            System.out.println(demoCallback.map);
            TimeUnit.MILLISECONDS.sleep(500);
        }

    }
}
