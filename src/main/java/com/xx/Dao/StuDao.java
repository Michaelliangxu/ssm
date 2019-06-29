package com.xx.dao;

import com.xx.domain.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StuDao {
    void saveStu(Student stu);

    @Select("select * from stu ")
    List<Student> findAll();
}
