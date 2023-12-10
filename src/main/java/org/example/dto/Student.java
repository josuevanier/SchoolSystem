package org.example.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;


/**
 * Contains the info of a student
 * @author Joseph Josue Forestal
 */
@Getter
@Setter
public class Student {
    private String fname;
    private String name;
    private String studentId;

    private int courseNum;
    private Department department;
    private Course[] courses;
    private int nextId = 1;

    /**
     * Contains the info of a student as an object
     *
     * @param fname      fname of student
     * @param name       last name of student
     * @param department student
     */
    public Student(String fname, String name, Department department) {
        this.fname = fname;
        this.name = name;
        this.studentId = String.format("SOO%d", nextId++);
        this.courseNum = 0;
        this.department = department;
        this.courses = new Course[SchoolManagementSystem.getMAX_REGISTERED_COURSES()];
    }

    @Override
    public String toString() {
        String courseArray = "";
        for (Course course : courses) {
            if (course != null) {
                courseArray += course.getCourseName() + ",";
            }
        }
        return String.format("Student{ Id : %s | First name : %s | Last name : %s | Number of course : %d | Department : %s%n | courses : %s }\n",
                studentId, fname, name, courseNum, department.getDepartmentName(), courseArray);
    }
}
