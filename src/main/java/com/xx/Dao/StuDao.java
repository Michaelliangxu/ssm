package com.xx.Dao;

import com.xx.domain.Student;

import java.util.List;

public interface StuDao {
    public void saveStu(Student stu);

    public List<Student> findAll();
}
