package com.springdata.service;

import com.springdata.dao.StudentRegistory;
import com.springdata.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author jiangshuai
 * @date 2020/6/28 0028 11:50
 */
@Service
public class StudentService {
    @Autowired
    private StudentRegistory studentRegistory;

    public List<Student> selectAll() {
        return studentRegistory.findAll();
    }

    public Optional<Student> selectStudentById(Long i) {

        Optional<Student> byId = studentRegistory.findById(i);
        if (byId != null) {
            return byId;
        }
        //abvdnfjbndfjbnjdfb
        return null;
    }
}
