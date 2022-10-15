package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Client {
    @Value("shivdatt bibhar")
    private String clientName;
    @Value("kesinga,kalahandi")
    private String clientAddress;

    public Singda getSingda() {
        return singda;
    }

    public void setSingda(Singda singda) {
        this.singda = singda;
    }

    private Singda singda;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("clientName='").append(clientName).append('\'');
        sb.append(", clientAddress='").append(clientAddress).append('\'');
        sb.append(", singda=").append(singda);
        sb.append('}');
        return sb.toString();
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }
    public void data(){
        System.out.println("Client is fetched!!!");
    }

}
