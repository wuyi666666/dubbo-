package org.example.testConsumer;

import org.example.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF\\spring\\consumer.xml");
        DemoService demoService = context.getBean("demoService", DemoService.class);

        String wy = demoService.sayHello("wy");
        System.out.println(wy);
    }
}
