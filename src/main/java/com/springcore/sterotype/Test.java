package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("stereoconfig.xml");
//        Student student=(Student)context.getBean("student",Student.class);
        Student student=(Student)context.getBean("ob",Student.class);
        System.out.println(student);
        System.out.println(student.getAddress());
        System.out.println(student.getAddress().getClass().getName());
    }
}
