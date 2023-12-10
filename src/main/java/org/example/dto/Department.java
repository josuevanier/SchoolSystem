package org.example.dto;

import lombok.Getter;
import lombok.ToString;

/**
 * Contains the info of a department
 * @author  Joseph Josue Forestal
 */
@Getter
@ToString
public class Department {
    private String id;
    private String departmentName;
    private  int nextId = 1;

    /**
     * @param departmentName department name
     */
    public Department( String departmentName) {
        this.id = String.format("DOO%d", nextId++);
        this.departmentName = departmentName;
    }
}