package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private String name;
    private List phones;
    private Set<String> addresses;
    private Map<String ,String> courses;
//    private Properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getPhones() {
        return phones;
    }

    public void setPhones(List phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Employee(String name, List phones, Set<String> addresses, Map<String, String> courses) {
        this.name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", phones=").append(phones);
        sb.append(", addresses=").append(addresses);
        sb.append(", courses=").append(courses);
        sb.append('}');
        return sb.toString();
    }
}
