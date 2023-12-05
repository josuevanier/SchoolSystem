package org.example.dto;

import lombok.Getter;

@Getter
/**
 * Contains the info of a department
 * @author  Joseph Josue Forestal
 */
public class Department {
    private String id;

    private String departmentName;

    private SchoolManagementSystem schoolManagementSystem;

    /**
     * @param schoolManagementSystem
     * @param departmentName
     */

    public Department(SchoolManagementSystem schoolManagementSystem, String departmentName) {
        this.id = String.format("DOO%d", schoolManagementSystem.getDepartmentCount() + 1);
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