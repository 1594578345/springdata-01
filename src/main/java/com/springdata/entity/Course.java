package com.springdata.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @author jiangshuai
 * @date 2020/6/28 0028 16:28
 */
@Entity
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String courseName;
    @ManyToMany(mappedBy = "courseList")
    private List<Student> studentList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
