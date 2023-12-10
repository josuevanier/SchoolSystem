package org.example.dto;

import lombok.Getter;import lombok.ToString;

@Getter
@ToString
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

    /**
     *
     * @return
     */
    public String getName(){
        return fname + " " + lname;
    }
}
