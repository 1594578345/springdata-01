package com.springdata.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author jiangshuai
 * @date 2020/6/28 0028 11:28
 */
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String sex;
    private Integer age;
    @Temporal(TemporalType.DATE)
    private Date birthday;
    @ManyToMany(fetch = FetchType.EAGER)//取消延迟加载
    @JoinTable(name = "stu_course", joinColumns = @JoinColumn(name = "stu_id"), inverseJoinColumns = @JoinColumn(name = "c_id"))
    private List<Course> courseList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
