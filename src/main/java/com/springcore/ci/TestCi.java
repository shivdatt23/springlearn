package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCi {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ciconfig.xml");
        Person p1=(Person) context.getBean("person1");
        Person p2=(Person) context.getBean("person2");
        Addition a1=(Addition) context.getBean("addition");
        System.out.println(p1);
        System.out.println(p2);
        a1.doSum();


    }
}
