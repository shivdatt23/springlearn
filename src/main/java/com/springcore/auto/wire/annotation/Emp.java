package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier("address2")
//    qualifier annotation is basically used to inject dependency using a specific bean
    private Address address;

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        System.out.println("setting address");
        this.address = address;
    }

    public Emp() {
    }
//    @Autowired
    public Emp(Address address) {

        this.address = address;
        System.out.println("inside constructor");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}
