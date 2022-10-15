package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//this annotation is used to create configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
    @Bean
    public Singda getSingda(){
        return new Singda();
    }

    @Bean
    public Client getClient(){
        Client client=new Client();
        client.data();
        client.getSingda();
        return client;
    }

}
