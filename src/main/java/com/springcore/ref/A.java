package com.springcore.ref;

public class A {
    private int x;
    private B in;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getIn() {
        return in;
    }

    public void setIn(B in) {
        this.in = in;
    }

    public A(int x, B in) {
        this.x = x;
        this.in = in;
    }

    public A() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("A{");
        sb.append("x=").append(x);
        sb.append(", in=").append(in);
        sb.append('}');
        return sb.toString();
    }
}
