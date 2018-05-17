package com.sky.service.impl;


import com.sky.mapper.StudentMapper;
import com.sky.pojo.Student;
import com.sky.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Haojie.Wang
 * @Description:
 * @CreateDate: 2018/5/15 19:32
 * @Version: 1.0
 */

@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {


    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student selectByPrimaryKey(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
