package org.example.dto;

import lombok.Getter;

/**
 * Contains the info of a student
 * @author Joseph Josue Forestal
 */
@Getter
public class Student {
    private String fname;
    private String name;
    private String id;

    private int courseNum;
    private Department department;
    private Course[] courses;
    private SchoolManagementSystem  schoolManagementSystem;

    /**
     * Contains the info of a student as an object
     * @param fname fname of student
     * @param name last name of student
     * @param department student
     */
    public Student(String fname, String name, Department department, SchoolManagementSystem schoolManagementSystem
    ){
        this.fname = fname;
        this.name = name;
        this.id = String.format("COO%d", schoolManagementSystem.getStudentCount());
        this.courseNum = 0;
        this.department = department;
        this.courses = new Course[SchoolManagementSystem.getMAX_COURSES()];
    }

    /**
     * String method that return a string.
     * @return a String
     */
    public String toString(){
        return "";
    }
}
