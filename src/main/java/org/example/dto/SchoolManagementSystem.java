package org.example.dto;

import lombok.Getter;
import lombok.ToString;


/**
 * Contains  method of a school management
 * @author Joseph Josue Forestal
 */
@Getter
@ToString
public class SchoolManagementSystem {

    private static final int MAX_DEPARTMENTS = 5;
    @Getter
    private static final int MAX_STUDENTS = 200;
    private static final int MAX_TEACHERS= 20;
    @Getter
    private static final int MAX_COURSES = 30;
    private static final int MAX_REGISTERED_COURSES = 5;

    @Getter
    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;

   @Getter
    private int departmentCount;
    //private int studentCount;
    //private int teacherCount;
    //private int courseCount;

    public SchoolManagementSystem(){
        this.departments= new Department[MAX_DEPARTMENTS];
        this.students = new Student[MAX_STUDENTS];
        this.teachers = new  Teacher[MAX_TEACHERS];
        this.courses = new Course[MAX_COURSES];


        this.departmentCount = 0;
      //  this.studentCount = 0;
        //this.teacherCount = 0;
        //this.courseCount = 0;

    }
// .equals (departmentid)
    /**
     * Find department
     * @param departementId the id of the department
     * @return  info on the departement
     */
    public Department findDepartment(String departementId){
        for(Department departement : departments){
            if (departement != null && departement.getId().equals(departementId)){
                return departement;
            }
            else{
                System.out.println("Department is null");
            }
        }
        return null;
    }

    /**
     * print the teacher
     * no return type
     */
     public void printTeacher(){
         for(Department department : departments){
             if(department != null){
                 for (Teacher teacher : teachers){
                     if(teacher != null){
                         System.out.printf("Teacher's id: %s, first name : %s, last name: %s, department : %s", teacher.getId(), teacher.getFname(),
                                 teacher.getLname(), teacher.getDepartment().getDepartmentName());
                     }
                 }
             }
         }
     }

    /***
     * modify course and the teacher
     * @param teacherId the teacher id
     * @param courseId the course id
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {
        boolean teacherFound = false;
        boolean courseFound = false;
        for (Teacher teacher : teachers) {
            if (teacher != null && teacher.getId().equals(teacherId)) {
                System.out.println("Teacher modified.");

                teacherFound = true;
                break;
            }
        }
        for (Course course : courses) {
            if (course != null && course.getId().equals(courseId)) {
                System.out.println("Course modified.");
                courseFound = true;
                break;
            }
        }
        if (!teacherFound && !courseFound) {
            System.out.println("Can't find teacher and course.");
        }
    }

    /**
     * New department
     * @param departmentName name of the department
     */
    public void addDepartment(String departmentName) {
        if (departmentCount < MAX_DEPARTMENTS) {
            Department newPartement = new Department(this, departmentName);

            departments[departmentCount++] = newPartement;
            System.out.println("Department added " + newPartement);

        } else {
            System.out.println(" Department is at his max");
        }
    }


    /**
     * print the student
     */
    public void printStudent(){
        for(Student student : students){
            if(student != null){
                System.out.printf("Student info: id: %s, name: %s, fname: %s, department name: %s, number of course: %d: ", student.getId(),
                        student.getName(), student.getFname(), student.getDepartment().getDepartmentName(), student.getCourseNum());
            }
        }

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
    public void printDepartment() {
        for (Department department : departments) {
            if (department != null) {
                System.out.printf("id: %s, department name : %s ", department.getId(), department.getDepartmentName());
                break;
            }
        }
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
     */
    public void findTeacher( ){

    }
}
