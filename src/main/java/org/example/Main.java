package org.example;

import org.example.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem c1 = new SchoolManagementSystem("Vainer college");

        c1.addDepartment("Computer science");

        c1.addCourse("Intro to programing", 3.75, "DOO1");

        c1.addTeacher("Wang", "Yi", "DOO1");

        c1.modifyCourseTeacher("TOO1", "COO1");

        c1.addStudent("Joseph", "Forestall", "DOO1");

        c1.registerCourse("SOO1", "COO1");

        c1.printCourse();

        c1.printTeacher();

        c1.printStudent();

        c1.printDepartment();

        c1.findCourse("COO3");

        c1.findDepartment("DOO2");

        c1.findTeacher("TOO2");

        c1.findStudent("SOO2");
    }
}
