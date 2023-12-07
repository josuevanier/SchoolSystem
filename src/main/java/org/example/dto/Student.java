package org.example.dto;

import lombok.Getter;

import java.util.Arrays;

/**
 * Contains the info of a student
 * @author Joseph Josue Forestal
 */
@Getter
public class Student {
    private String fname;
    private String name;
    private String studentId;

    private int courseNum;
    private Department department;
    private Course[] courses;
    private  int nextId = 1;

    /**
     * Contains the info of a student as an object
     * @param fname fname of student
     * @param name last name of student
     * @param department student
     */
    public Student(String fname, String name, String id, Department department){
        this.fname = fname;
        this.name = name;
        this.studentId = String.format("SOO%d", nextId++);
        this.courseNum = 0;
        this.department = department;
        this.courses = new Course[SchoolManagementSystem.getMAX_COURSES()];
    }

    /**
     * String method that return a string.
     * @return a String
     */
    public String toString(){
        return String.format("Student{id = %s, fname %s, name %s, department %s, course num %d , courses %s }",
                id, fname, name, department, courseNum, Arrays.toString(courses));
    }
}
