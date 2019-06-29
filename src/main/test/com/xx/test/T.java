package com.xx.test;

import com.xx.domain.Student;
import com.xx.service.serviceImpl.StuServiceImpl;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T {
    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        StuServiceImpl ss = ac.getBean(StuServiceImpl.class);
        ss.findAll();

        Student student = new Student();
        student.setAge(10);
        student.setName("xiaohau");
        ss.saveStu(student);

    }
}
