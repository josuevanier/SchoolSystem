package org.example.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Contains the info a course
 * @author Joseph Josue Forestal
 */
@Getter
@Setter
public class Course {
    private double credit;
    private String id;
    private Student[] students;
    private Teacher teacher;
    private  String courseName;
    private  Department department;
    private int studentNum;
    private  int nextId = 1;

    /**
     * Constructor to create the object course
     * @param courseName the courseName of the cours
     * @param credit credit of the course
     */
    public Course(String courseName, double credit, Department department){
        this.id = String.format("COO%d", nextId++);
        this.credit = credit;
        this.courseName = courseName;
        this.studentNum = 1;
        this.department = department;
        this.students = new Student[SchoolManagementSystem.getMAX_STUDENTS()];
    }
    @Override
    public String toString() {
        return String.format("Course{Id : %s |Credit: %f |course name : %s | Course teacher  : %s | Department : %s}\n",
                id, credit, courseName, (teacher != null) ? teacher.getName() : "No teacher for this course",
                department.getDepartmentName());
    }
}

