package org.example;

import org.example.dto.SchoolManagementSystem;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem c1 = new SchoolManagementSystem();

        c1.addDepartment("JO");

        c1.printDepartment();
        System.out.println(c1);



    }
}