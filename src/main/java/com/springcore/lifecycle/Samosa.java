package com.springcore.lifecycle;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }
    public void init(){
        System.out.println("inside init method");
    }
    public void setPrice(double price) {
        System.out.println("setting price");
        this.price = price;
    }

    public Samosa(double price) {
        this.price = price;
    }

    public Samosa() {
    }

    @Override
    public String  toString() {
        final StringBuilder sb = new StringBuilder("Samosa{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    public void destroys(){
        System.out.println("inside destroy method");
    }
}
