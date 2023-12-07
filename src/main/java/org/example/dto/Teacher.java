package org.example.dto;

import lombok.Getter;

@Getter
public class Teacher {
    private String lname;
    private String fname;
    private Department department;
    private String id;
    private static int  nextId = 1;

    public String toString(){
        return String.format("");
    }


}
