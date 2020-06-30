package com.springdata.dao;

import com.springdata.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jiangshuai
 * @date 2020/6/28 0028 11:49
 */
public interface StudentRegistory extends JpaRepository<Student, Long> {
}
