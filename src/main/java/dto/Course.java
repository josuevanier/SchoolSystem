package dto;

/**
 * Contains the info a course
 * @author Joseph Josue Forestal
 */
public class Course {
    private double credit;
    private String id;
    private Student[] students;
    private Teacher teacher;
    private  String courseName;
    private int studentNUM;
    private final static int MAX_ID_NUM = 0;

    /**
     * Constructor to create the object course
     * @param id
     * @param credit
     */
    public Course(String id, double credit, Department){

    }

    /**
     * String method that return a string
     * @return a String
     */
    public String toString(){
        return "";
    }
}
