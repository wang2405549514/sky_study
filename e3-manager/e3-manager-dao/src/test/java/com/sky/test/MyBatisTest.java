package com.sky.test;

import com.sky.mapper.StudentMapper;
import com.sky.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Haojie.Wang
 * @Description:
 * @CreateDate: 2018/5/9 17:04
 * @Version: 1.0
 */
public class MyBatisTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
       // StudentMapper studentMapper = (StudentMapper) context.getBean("studentMapper");
        StudentMapper bean = context.getBean(StudentMapper.class);
        Student student = new Student();
        student.setAge(1);
        student.setName("whj");
        Student student1 = bean.selectByPrimaryKey(1);

        System.out.println(student1);
    }
}
