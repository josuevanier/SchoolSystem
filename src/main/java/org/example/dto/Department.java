package org.example.dto;

import lombok.Getter;


/**
 * Contains the info of a department
 * @author  Joseph Josue Forestal
 */
@Getter
public class Department {
    private String id;

    private String departmentName;
    private int nextId = 1;
    private SchoolManagementSystem schoolManagementSystem;

    /**
     * @param schoolManagementSystem schoolmanagement in order to get count
     * @param departmentName department name
     */

    public Department(SchoolManagementSystem schoolManagementSystem, String departmentName) {
        this.id = String.format("DOO%d", nextId++);
        this.departmentName = departmentName;

    }

    /**
     * String method that return a string.
     *
     * @return a String
     */
    public String toString() {
        return String.format("Id is %s, Department name: %s", id, departmentName);
    }
}