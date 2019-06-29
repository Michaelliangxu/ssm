package com.xx.controller;

import com.xx.domain.Student;
import com.xx.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("stu")
public class StudentController {
    @Autowired
    private StuService stuService;

    @RequestMapping("findStu")
    @ResponseBody
    public String findStu(){
        List<Student> all = stuService.findAll();
        return all.toString();
    }

}
