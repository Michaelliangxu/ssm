package com.xx.service.serviceImpl;

import com.xx.dao.StuDao;
import com.xx.domain.Student;
import com.xx.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StuDao stuDao;

    public void saveStu(Student stu) {
        stuDao.saveStu(stu);
    }

    public List<Student> findAll() {
        return stuDao.findAll();
    }
}
