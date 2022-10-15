package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSamosa {
    public static void main(String[] args) {

       AbstractApplicationContext  context=new ClassPathXmlApplicationContext("lcconfig.xml");
        Samosa s=(Samosa) context.getBean("samosa");
        System.out.println(s);
        context.registerShutdownHook();
    }
}
