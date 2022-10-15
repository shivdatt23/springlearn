package com.springcore.auto.wire;

public class Emp {
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
