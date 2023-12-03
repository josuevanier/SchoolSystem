package dto;

/**
 * Contains the info of a student
 * @author Joseph Josue Forestal
 */
public class Student {
    private String fname;
    private String name;
    private String id;
    private int nextId;
    private int courseNum;
    private Course[] courses;

    public Student(String fname, String lname, String id){
        this.fname = fname;
        this.name = name;
        this.id = String.format("COO%d", nextId++)
        this.courseNum = 0;
        this.courses = new Course[MAX_COURSES];
    }

    /**
     * String method that return a string.
     * @return a String
     */
    public String toString(){

        return "";
    }
}
