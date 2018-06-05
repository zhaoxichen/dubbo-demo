package com.my.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.dubbo.server.DemoService;

public class ClientMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "classpath:applicationConsumer.xml" });
        context.start();
        DemoService service = (DemoService) context.getBean("demoService");
        System.out.println(service.sayHello("world"));
        context.close();
    }
}
