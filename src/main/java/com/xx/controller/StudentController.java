package com.xx.controller;

import com.alibaba.fastjson.JSON;
import com.xx.CustomerExcption.CustomException;
import com.xx.domain.Student;
import com.xx.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StuService stuService;

    @RequestMapping("findStu")
    public String findStu() {

        List<Student> all = stuService.findAll();
        return all.toString();
    }

    @RequestMapping(path = "reLoad", method = RequestMethod.GET)
    public String reLoad(Date date) {
        System.out.println(date);
        return JSON.toJSONString(date);
    }

    @RequestMapping("testAnno")
    public String testAnno(Student student) {
        System.out.println("控制器方法执行");
        return student.toString();
    }

    @RequestMapping("testReturn")
    public ModelAndView testReturn()  {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name","xuliang");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("testException")
    public String testException() throws CustomException {
        try {
            int a=10/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw  new CustomException("数据异常");
        }
        return "index";
    }

}
