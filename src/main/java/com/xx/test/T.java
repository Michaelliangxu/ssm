package com.xx.test;

import com.xx.dao.StuDao;
import com.xx.domain.Student;
import com.xx.service.serviceImpl.StuServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

public class T {

    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        StuServiceImpl ss = ac.getBean(StuServiceImpl.class);
        ss.findAll();

        Student student = new Student();
        student.setAge(10);
        student.setName("xiaohau");
        ss.saveStu(student);

    }

    @Test
    public void run1() throws Exception {
        // 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        // 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        // 创建sqlSession对象
        SqlSession session = factory.openSession();
        // 获取代理对象
        StuDao dao = session.getMapper(StuDao.class);
        // 调用查询的方法
        List<Student> all = dao.findAll();
        // 释放资源
        for (Student s : all) {
            System.out.println(s);
        }
        session.close();
        inputStream.close();
    }
}


