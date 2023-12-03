import dto.Course;
import dto.Department;

/**
 * Contains  method of a school management
 * @author Joseph Josue Forestal
 */
public class SchoolManagementSystem {

    private static final int MAX_DEPARTMENTS = 5;
    private static final int MAX_STUDENTS = 200;
    private static final int MAX_TEACHERS= 20;
    private static final int MAX_COURSES = 30;
    private static final int MAX_REGISTERED_COURSES = 5;

    private int departmentCount;
    private int studentCount;
    private int teacherCount;
    private int courseCount;

    public SchoolManagementSystem(){
        this.departments = new Department [MAX_DEPARTMENTS];

    }


    /**
     * Find department
     * @param departementId the id of the department
     * @return  info on the departement
     */
    public Department findDepartment(String departementId){
        return null;
    }

    /**
     * print the teacher i guess
     * no return type
     */
     public void printTeacher(){

     }

    /***
     * modify course and the teacher
     * @param teacherId the teacher id
     * @param courseId the course id
     */
    public void modifyCourseTeacher(String teacherId, String courseId){

    }

    /**
     * New department
     * @param departmentName name of the department
     */
    public void addDepartement(String departmentName){

    }

    /**
     * print the student
     */
    public void printStudent(){

    }

    /**
     * add course
     * @param courseName name of the course
     * @param credit credits of the course
     * @param courseId id of the course
     */
    public void addCourse(String courseName, double credit, String courseId){

    }

    /**
     * Register the course
     * @param studentId student id
     * @param courseId
     */
    public void registerCourse(String studentId, String courseId){

    }

    /**
     * find the course
     * @param courseName based on the course name
     * @return
     */
    public Course findCourse(String courseName){
        return null;
    }

    /**
     * Print department
     */
    public void printDepartment(){

    }

    /**
     * Add a student
     * @param lname last name of student
     * @param name first name of student
     * @param id student id
     */
    public void addStudent(String lname, String name, String id){

    }

    /***
     *  Find teacher
     * @param name teacher's name
     */
    public void findTeacher(String name){

    }
}
