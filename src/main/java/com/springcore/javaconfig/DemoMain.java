package com.springcore.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        Client client=context.getBean("client",Client.class);
//        using the annotation ComponentScan()
        Client client2=context.getBean("getClient",Client.class);
//        using the bean creation @Bean
        System.out.println(client.toString());
        System.out.println(client2.toString());
        client2.getSingda().tosingda();
    }
}
