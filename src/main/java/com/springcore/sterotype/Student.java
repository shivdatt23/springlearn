package com.springcore.sterotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
@Component("ob")
//@Scope("prototype")
//using the prototype scope the hascode of the created objects has been changed
@Scope("singleton")
public class Student {
    @Value("shivdatt bibhar")
    private String sName;
    @Value("kesinga")
    private String sCity;
    @Value("#{list}")
    private List<String> address;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("sName='").append(sName).append('\'');
        sb.append(", sCity='").append(sCity).append('\'');
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsCity() {
        return sCity;
    }

    public void setsCity(String sCity) {
        this.sCity = sCity;
    }

}
