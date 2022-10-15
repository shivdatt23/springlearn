package com.springcore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentstereo")
class StudentStereo {
    @Value("12w")
    private int studentId;
    @Value("shivdatt")
    private String studentName;
    @Value("kesinga")
    private String studentAddress;

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }
    //setters

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String toString(){
        return " Student [ studentId= "+studentId +" studentName= "+studentName+" studentAddress= "+studentAddress+"  ]";
    }
}
