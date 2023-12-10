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
    private static int nextId = 1;

    /**
     * Constructor to create the object course
     * @param courseName the courseName of the cours
     * @param credit
     */
    public Course(String courseName, double credit, Department department){

        this.id = String.format("COO%d", nextId++);
        this.credit = credit;
        this.courseName = courseName;
        this.studentNum = 1;
        this.students = new Student[SchoolManagementSystem.getMAX_STUDENTS()];
    }
    @Override
    public String toString() {
        return String.format("Course{Id : %s |Credit: %f |course name : %s | Course teacher  : %s}\n",
                id, credit, courseName, (teacher != null) ? teacher.getName() : "No teacher for this course");
    }
}

