package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context= new  ClassPathXmlApplicationContext("autoconfig.xml");

        Emp emp=(Emp) context.getBean("emp");
        System.out.println(emp);
    }
}
