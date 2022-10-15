package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Examination {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Examination() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Examination{");
        sb.append("subject='").append(subject).append('\'');
        sb.append('}');
        return sb.toString();
    }
    @PostConstruct
    public void start(){
        System.out.println("init method starts");
    }
    @PreDestroy
    public void end(){
        System.out.println("destroy method ");
    }
}
