package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExam {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("lccinfig.xml");
        Examination exam=(Examination) context.getBean("exam1");
        System.out.println(exam);
    }
}
