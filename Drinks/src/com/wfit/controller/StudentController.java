package com.wfit.controller;

import com.wfit.model.Student;
import com.wfit.service.StudentService;
import com.wfit.service.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

    private StudentService studentService;

    /*新增学生信息*/
    public void addStudent(Student student)throws Exception{
        studentService = new StudentServiceImpl();
        try{
           studentService = new StudentServiceImpl();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

//    修改学生信息
    public void updateStudent(Student student)throws Exception{
        studentService = new StudentServiceImpl();
        try {
            studentService.updateStudent(student);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    //删除学生信息
    public void delStudent(String no)throws Exception{
        studentService = new StudentServiceImpl();
        try {
            studentService.delStudent(no);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * 查询学生信息
     * @return
     * @throws Exception
     */
    public List<Student> queryStudent()throws Exception{
        studentService = new StudentServiceImpl();
        List<Student> list = new ArrayList<>();
        try{
            list = studentService.queryStudent();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }


}
