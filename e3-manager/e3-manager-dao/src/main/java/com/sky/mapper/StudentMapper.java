package com.sky.mapper;

import com.sky.pojo.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    List<Student> selectAllStudent();

    int updateByPrimaryKey(Student record);
}