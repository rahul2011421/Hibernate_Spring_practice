package org.example.mapping.manytomany;

import javax.persistence.*;
import java.util.List;
@Entity
public class Student {
    @Id
    @Column(name="student_Id")
    private int studentId;
    private String studentName;
    @ManyToMany
    @JoinTable(name = "students_enrolled_in_courses",
    joinColumns = {@JoinColumn(name = "sid")},
    inverseJoinColumns ={@JoinColumn(name = "cid")})
    private List<Course> courses;

    public Student(){

    }

    public Student(int studentId, String studentName, List<Course> courses) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courses = courses;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
