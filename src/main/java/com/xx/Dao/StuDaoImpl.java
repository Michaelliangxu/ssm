package com.xx.Dao;

import com.xx.domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StuDaoImpl  implements StuDao {

    public void saveStu(Student stu) {
        System.out.println("save....");
    }

    public List<Student> findAll() {
        System.out.println("findAll....");
        return null;
    }
}
