package com.springdata;

import com.springdata.entity.Student;
import com.springdata.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class Springdata01ApplicationTests {
    @Autowired
    private StudentService studentService;

    @Test
    void contextLoads() {
    }

    @Test
    void selectAll() {
        List<Student> students = studentService.selectAll();
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    @Test
    void selectStudentById() {
        Optional<Student> student = studentService.selectStudentById(2L);
        System.out.println(student.get().getCourseList().get(0).getCourseName());
    }

    @Test
    void addStudent() {
    }

    @Test
    void deleteStudent() {
    }

    @Test
    void updateStudent() {
    }
}
