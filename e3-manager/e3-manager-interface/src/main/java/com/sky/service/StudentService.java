package com.sky.service;

import com.sky.pojo.Student;

/**
 * @Author: Haojie.Wang
 * @Description:
 * @CreateDate: 2018/5/15 19:31
 * @Version: 1.0
 */
public interface StudentService {

    Student selectByPrimaryKey(Integer id);
}
