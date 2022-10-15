package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("collectionconfig.xml");
        Employee emp1=(Employee) context.getBean("employee1");
        System.out.println(emp1);
        Employee emp2=(Employee) context.getBean("emp2");
        System.out.println(emp2);

    }
}
