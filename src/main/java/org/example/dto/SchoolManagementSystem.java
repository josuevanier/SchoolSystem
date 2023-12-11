package org.example.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Contains  method of a school management
 * @author Joseph Josue Forestal
 */
@Getter
@Setter
public class SchoolManagementSystem {
    private String schoolName;

    private static final int MAX_DEPARTMENTS = 5;
    @Getter
    private static final int MAX_STUDENTS = 200;
    @Getter
    private static final int MAX_TEACHERS= 20;
    @Getter
    private static final int MAX_COURSES = 30;
    @Getter
    private static final int MAX_REGISTERED_COURSES = 5;

    private Department[] departments;
    private final Student[] students;
    private final Teacher[] teachers;
    private final Course[] courses;

    private int departmentCount;
    private int studentCount;
    private int teacherCount;
    private int courseCount;

    /**
     * Contains the info of a school system as an object.
     * @param name School name
     */
    public SchoolManagementSystem(String name){
        this.schoolName = name;
        this.departments= new Department[MAX_DEPARTMENTS];
        this.students = new Student[MAX_STUDENTS];
        this.teachers = new  Teacher[MAX_TEACHERS];
        this.courses = new Course[MAX_COURSES];

        this.departmentCount = 0;
         this.studentCount = 0;
         this.teacherCount = 0;
        this.courseCount = 0;
    }

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
        }
        System.out.printf("Department %s was not found", departementId);
        return null;
    }

    /**
     * print the teacher
     * no return type
     */
     public void printTeacher(){
     for (Teacher teacher : teachers){
         if(teacher != null){
             System.out.printf("Teacher's id: %s, first name : %s, last name: %s, department : %s",
                     teacher.getTeacherId(), teacher.getFname(),
                     teacher.getLname(), teacher.getDepartment().getDepartmentName());
         }
     }
 }

    /***
     * modify course and the teacher
     * @param teacherId the teacher id
     * @param courseId the course id
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {
        Teacher teacherFound = findTeacher(teacherId);
        Course courseFound = findCourse(courseId);

        if(teacherFound !=null){
            System.out.println("Teacher modified");
        } else {
            System.out.println("Can't find teacher");
        }
        if(courseFound != null){
            System.out.println("Course modified");
            courseFound.setTeacher(teacherFound);
        } else{
            System.out.println("Can't find course");
        }
    }

    /**
     * Add new department
     * @param departmentName name of the department
     */
    public void addDepartment(String departmentName) {
        if (departmentCount < MAX_DEPARTMENTS) {
            Department newDepartment = new Department(departmentName);
            departments[departmentCount++] = newDepartment;
            System.out.printf("Added department %s successfully\n", newDepartment);
        } else {
            System.out.println(" Department is at it's max");
        }
    }

    /**
     * print the student
     */
    public void printStudent(){
        for(Student student : students){
            if(student != null){
                System.out.printf("Student info: id: %s, name: %s, First name: %s, department name: %s, number of course: %d\n",
                        student.getStudentId(), student.getName(), student.getFname(),
                        student.getDepartment().getDepartmentName(), student.getCourseNum());
            }
        }
    }

    /**
     * Add course
     * @param courseName name of the course
     * @param credit credits of the course
     * @param departmentId id of the course
     */
    public void addCourse(String courseName, double credit, String departmentId){
        if(courseCount < MAX_STUDENTS){
            Course newCourse = new Course(courseName, credit, findDepartment(departmentId));
            courses[courseCount++] = newCourse;
            System.out.println(newCourse);
        } else {
            System.out.println("Course has reached its limits !\n");
        }
    }

    /**
     * Register to a course
     * @param studentId student id
     * @param courseId course id
     */
    public void registerCourse(String studentId, String courseId) {
        Student student = findStudent(studentId);
        Course course = findCourse(courseId);
        if (student != null && course != null) {
            if (!hasRegisteredForThisCourse(studentId, courseId)) {
                if (student.getCourseNum() < MAX_REGISTERED_COURSES) {
                    if (student.getCourses() == null) {
                        student.setCourses(new Course[MAX_REGISTERED_COURSES]);
                    }
                    student.getCourses()[student.getCourseNum()] = course;
                    student.setCourseNum(student.getCourseNum() + 1);
                    System.out.printf("Student %s registered for  %s\n",
                            student.getStudentId(), course.getCourseName());
                } else {
                    System.out.println("Max registered Course\n");
                }
            } else {
                System.out.printf("Student %s is already in the course %s\n",
                        student.getStudentId(), course.getCourseName());
             }
        } else {
            System.out.println("Student or department was not found : input again\n");
        }
    }

    /**
     * find the course
     * @param courseId based on the course id
     * @return return course
     */
    public Course findCourse(String courseId){
        for(Course course : courses){
            if( course != null && course.getId().equals(courseId)){
                return course;
            }
        }
        System.out.printf("Course %s is not found !\n", courseId);
        return null;
    }

    /**
     * Print department
     */
    public void printDepartment() {
        for (Department department : departments) {
            if (department != null) {
                System.out.printf("id: %s, department name : %s\n",
                        department.getId(), department.getDepartmentName());
            }
        }
    }

    /**
     * Add a student to a course
     * @param lname last name of the student
     * @param name name of the student
     * @param departmentId department id for student
     */
    public void addStudent(String lname, String name, String departmentId) {
        if (studentCount < MAX_STUDENTS) {
            Department department = findDepartment(departmentId);
            if(department != null) {
                Student newStudent = new Student(lname, name, department);
                students[studentCount++] = newStudent;
                System.out.println(newStudent);
            }
            else{
                System.out.println("Department was not found, enter proper department\n");
            }
        }
        else {
            System.out.println("Student max has been reach.");
        }
    }

    /**
     * Find student
     * @param studentId the student id
     * @return student
     */
    public Student findStudent(String studentId){
        for(Student student : students){
            if(student != null && student.getStudentId().equals(studentId)){
                return student;
            }
        }
        System.out.printf("Student %s can't be found!", studentId);
        return null;
    }

    /**
     * Find the teacher
     * @param teacherId teacher is id
     * @return teacher
     */
    public Teacher findTeacher(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher != null && teacher.getTeacherId().equals(teacherId)) {
                return teacher;
            }
        }
        System.out.printf("Teacher %s can't be found !\n",teacherId);
        return null;
    }

    /**
     * Add a teacher to a course
     * @param lname Teacher's last name
     * @param fname Teacher's first name
     * @param departmentId department id
     */
    public void addTeacher(String lname, String fname, String departmentId) {
        if (teacherCount < MAX_TEACHERS) {
            Department department = findDepartment(departmentId);
            if (department != null) {
                Teacher newTeacher = new Teacher(lname, fname, department);
                teachers[teacherCount++] = newTeacher;
                System.out.println(newTeacher);
            } else {
                System.out.println("Department %s can't be found\n");
            }
        } else {
            System.out.printf("No more teachers can't be added. Max teachers: %d", MAX_TEACHERS);
        }
    }

    /**
     * Print the courses
     */
    public void printCourse(){
        for(Course course : courses){
            if(course != null){
                System.out.println(course);
            }
        }
    }

    /**
     * check if student has registered for this course
     * @param studentId student Id
     * @param courseId course Id
     * @return true or false
     */
    private boolean hasRegisteredForThisCourse(String studentId, String courseId) {
        Student student = findStudent(studentId);
        Course course = findCourse(courseId);
        if (student != null && course != null) {
            for (Course registeredCourse : student.getCourses()) {
                if (registeredCourse != null && registeredCourse.getId().equals(courseId)) {
                    return true;
                }
            }
        }
        return false;
    }
}
