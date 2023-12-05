package com.wfit.service;

import com.wfit.dao.StudentDao;
import com.wfit.dao.StudentDaoImpl;
import com.wfit.model.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    private StudentDao studentDao;

    @Override
    public void addStudent(Student student) throws Exception {
        studentDao = new StudentDaoImpl(); //ioc
        studentDao.addStudent(student);
    }

    @Override
    public void updateStudent(Student student) throws Exception {
        studentDao = new StudentDaoImpl();
        studentDao.updateStudent(student);
    }

    @Override
    public void delStudent(String no) throws Exception {
        studentDao = new StudentDaoImpl();
        studentDao.delStudent(no);
    }

    /**
     * 查询学生信息
     * @return
     * @throws Exception
     */
    @Override
    public List<Student> queryStudent() throws Exception {
        studentDao = new StudentDaoImpl();
        return studentDao.queryStudent();
    }
}
