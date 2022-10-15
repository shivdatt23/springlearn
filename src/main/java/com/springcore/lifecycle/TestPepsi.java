package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPepsi {
    public static void main(String[] args) {
        AbstractApplicationContext con=new ClassPathXmlApplicationContext("lcconfig.xml");
        Pepsi pepsi=(Pepsi)con.getBean("p1");
        Samosa samosa=(Samosa)con.getBean("samosa") ;
        System.out.println(pepsi);
        System.out.println(samosa);
        con.registerShutdownHook();
    }
}
