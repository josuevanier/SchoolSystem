package org.example.dto;

import lombok.Getter;


/**
 * Contains the info a course
 * @author Joseph Josue Forestal
 */
@Getter
public class Course {
    private double credit;
    private String id;
    private Student[] students;
    private Teacher teacher;
    private  String courseName;
    private int studentNum;
    private int nextId;
    private final static int MAX_ID_NUM = 0;

    /**
     * Constructor to create the object course
     * @param id
     * @param credit
     */
    public Course(String id, double credit, Department department){

        this.id = String.format("C00%d", nextId++);
        this.credit = credit;
        this.courseName = courseName;
        this.studentNum = studentNum;
        this.students = new Student[SchoolManagementSystem.getMAX_STUDENTS()];
    }

    /**
     * String method that return a string
     * @return a String
     */
    public String toString(){
        return "";
    }
}
