package com.wfit.service;

import com.wfit.model.Student;

import java.util.List;

public interface StudentService {

    public void addStudent(Student student)throws Exception;
    public void updateStudent(Student student)throws Exception;
    public void delStudent(String no)throws Exception;
    public List<Student> queryStudent()throws Exception;

}
