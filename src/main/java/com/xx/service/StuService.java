package com.xx.service;

import com.xx.domain.Student;

import java.util.List;

public interface StuService {
     void saveStu(Student stu);

     List<Student> findAll();
}
