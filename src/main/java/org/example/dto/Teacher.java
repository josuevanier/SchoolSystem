package org.example.dto;

import lombok.Getter;

@Getter
public class Teacher {
    private String lname;
    private String fname;
    private Department department;
    private String id;
    private  int  nextId = 1;

    public Teacher(String lname, String fname, Department department){

        this.lname = lname;
        this.fname = fname;
        this.department = department;
        this.id = String.format("TOO%d", nextId++);
    }

    public String toString(){
        return String.format("");
    }
}
