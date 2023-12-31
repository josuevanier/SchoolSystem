package org.example.dto;

import lombok.Getter;

/**
 * Contains the info of a teacher
 * @author Joseph Josue Forestal
 */
@Getter
public class Teacher {
    private final String lname;
    private final String fname;
    private final Department department;
    private final String teacherId;
    private  int  nextId = 1;

    /**
     * Contains the info of a teacher as an object
     * @param lname Last name of a teacher
     * @param fname First name of a teacher
     * @param department department of a teacher
     */
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
    @Override
    public String toString(){
        return String.format("Teacher{Id: %s | Last name: %s | First name: %s | Department: %s | }\n",
                teacherId, lname, fname, department.getDepartmentName());
    }
}
