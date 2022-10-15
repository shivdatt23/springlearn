package com.springcore.ci;

import java.util.List;

public class Person {
    private String personName;
    private int personId;
    private Certi certi;
    private List p_number;
    public Person(String personName,int personId,Certi certi,List p_number){
        this.personId=personId;
        this.personName=personName;
        this.certi=certi;
        this.p_number=p_number;
    }
    public Person(){

    }
    public String toString(){
        return this.personName + " : "+ this.personId+" "+this.certi.name +"{"+this.p_number+"}";
    }

}
