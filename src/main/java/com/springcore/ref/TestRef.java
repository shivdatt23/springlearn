package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {
    public static void main (String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("configref.xml");
        A temp1=(A) context.getBean("ref2");
        B temp2=(B) context.getBean("ref1");
        System.out.println(temp1.getX());
        System.out.println(temp1.getIn().getY());
        System.out.println(temp2.getY());
    }
}
