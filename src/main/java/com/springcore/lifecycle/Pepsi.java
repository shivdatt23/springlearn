package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//implementation of bean life cycle using interfaces IniitailizingBean and DisposableBean
public class Pepsi implements InitializingBean, DisposableBean {
    private double pric;
    public double getPric() {
        return pric;
    }

    public void setPric(double price) {
        this.pric = price;
    }

    public Pepsi() {
    }

    @Override
    public String toString() {

        return "price :"+pric;
    }

    @Override
    public void destroy() throws Exception {
//        destroy
        System.out.println("taking pepsi : destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//init
        System.out.println("taking pepsi : init");
    }
}
