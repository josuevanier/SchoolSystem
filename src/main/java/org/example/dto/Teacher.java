package org.example.dto;

import lombok.Getter;

@Getter
public class Teacher {
    private String lname;
    private String fname;
    private Department department;
    private String id;

    public String toString(){
        return "";
    }


}
