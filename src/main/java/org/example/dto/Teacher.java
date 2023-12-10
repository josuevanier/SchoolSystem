package org.example.dto;

import lombok.Getter;import lombok.ToString;

@Getter
@ToString
public class Teacher {
    private String lname;
    private String fname;
    private Department department;
    private String teacherId;
    private  int  nextId = 1;

    public Teacher(String lname, String fname, Department department){

        this.lname = lname;
        this.fname = fname;
        this.department = department;
        this.teacherId = String.format("TOO%d", nextId++);
    }

    /**
     * Get  teacher's name
     * @return fname and lname .
     */
    public String getName(){
        return fname + " " + lname;
    }
}
