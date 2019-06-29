package com.xx.service;

import com.xx.domain.Student;

import java.util.List;

public interface StuService {
    public void saveStu(Student stu);

    public List<Student> findAll();
}
