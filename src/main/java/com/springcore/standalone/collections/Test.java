package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("aloneconfig.xml");
        Person p1=(Person) context.getBean("person",Person.class);
        System.out.println(p1.getFriends());
        System.out.println(p1.getFriends().getClass().getName());
        System.out.println("______________________________________");
        System.out.println(p1.getFeestructure());
        System.out.println(p1.getFeestructure().getClass().getName());
        System.out.println("________________________________________");
        System.out.println(p1.getProperties());


    }
}
