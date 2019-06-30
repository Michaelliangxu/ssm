package com.xx.controller;

import com.alibaba.fastjson.JSON;
import com.xx.domain.Student;
import com.xx.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StuService stuService;

    @RequestMapping("findStu")
    @ResponseBody
    public String findStu() {
        List<Student> all = stuService.findAll();
        return all.toString();
    }

    @RequestMapping(path = "reLoad",method = RequestMethod.GET)
    @ResponseBody
    public String reLoad(Date date) {
        System.out.println(date);
        return JSON.toJSONString(date);
    }


}
