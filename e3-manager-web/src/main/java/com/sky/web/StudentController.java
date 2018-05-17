package com.sky.web;

import com.sky.pojo.Student;
import com.sky.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @Author: Haojie.Wang
 * @Description:
 * @CreateDate: 2018/5/16 18:06
 * @Version: 1.0
 */

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/student")
    public ModelAndView index(Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        Student student = studentService.selectByPrimaryKey(id);
        modelAndView.addObject("student", student);
        modelAndView.setViewName("student");
        return modelAndView;
    }
}
