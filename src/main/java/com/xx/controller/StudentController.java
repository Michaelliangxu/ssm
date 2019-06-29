package com.xx.controller;

import com.xx.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("stu")
public class StudentController {
    @Autowired
    private StuService stuService;

    @RequestMapping("findStu")
    public String findStu(){
        stuService.findAll();
        return "index";
    }

}
