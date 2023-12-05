package com.wfit.test;

import com.wfit.controller.StudentController;
import com.wfit.model.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TestDemo {
    private StudentController studentController;

    @Before
    public void init(){
        studentController = new StudentController();
    }

    @Test
    public void testQuery()throws Exception{
        List<Student> list = studentController.queryStudent();
        list.forEach(student -> System.out.println(student));
    }

    @Test
    public void testAdd()throws Exception{
        Student student = new Student();
        student.setNo("1004");
        student.setName("wangwu");
        student.setAge(23);
        studentController.addStudent(student);
    }

    @Test
    public void testUpdate()throws Exception{
        Student student = new Student();
        student.setNo("1001");
        student.setName("lucy");
        student.setAge(23);
        studentController.updateStudent(student);
    }

    @Test
    public void testDel()throws Exception{
        String no = "1003";
        studentController.delStudent(no);
    }
}
