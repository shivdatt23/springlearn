package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{11+23}")
    private int x;
    @Value("#{23+22}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(144 )}")
private double z;
    @Value("#{T(java.lang.Math).PI}")
    private double pi;
    @Value("#{new java.lang.String('shivdatt')}")
private String name;
    @Value("#{8>3}")
private boolean isActive;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Demo{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", z=").append(z);
        sb.append(", pi=").append(pi);
        sb.append(", name='").append(name).append('\'');
        sb.append(", isActive=").append(isActive);
        sb.append('}');
        return sb.toString();
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
