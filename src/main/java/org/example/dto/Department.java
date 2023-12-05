package org.example.dto;

import lombok.Getter;

@Getter
/**
 * Contains the info of a department
 * @author  Joseph Josue Forestal
 */
public class Department {
    private String id;
    private int nextId;
    private String departmentName;
    /**
     *
     * @param id
     * @param departmentName
     */

    public  Department (String id, String departmentName ){
        this.id = String.format("DOO%d", nextId++);
        this.departmentName = departmentName;

    }

    /**
     * String method that return a string.
     * @return a String
     */
    public String toString(){
        return "";
    }
}