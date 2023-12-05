package com.wfit.dao;

import com.wfit.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl extends Dao implements StudentDao{
    /* 保存学生信息*/
    @Override
    public void addStudent(Student student) throws Exception {
        Connection conn = getConnection();
        //3.通过Connection对象获取Statement对象
        String sql = "insert into t_student VALUES (?,?,?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,student.getNo());
        ps.setString(2,student.getName());
        ps.setInt(3,student.getAge());
        //4.使用Statement执行sql语句
        ps.executeUpdate();
        //6.关闭连接释放资源
        ps.close();
        conn.close();
    }

    @Override
    public void updateStudent(Student student) throws Exception {
        Connection conn = getConnection();
        String sql = "update t_student set name = ? ,age = ? where no = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,student.getName());
        ps.setInt(2,student.getAge());
        ps.setString(3,student.getNo());
        ps.executeUpdate();
        ps.close();
        conn.close();
    }

    @Override
    public void delStudent(String no) throws Exception {
        Connection conn = getConnection();
        String sql = "delete from t_student where no = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,no);
        ps.executeUpdate();
        ps.close();
        conn.close();
    }

    /**
     * 查询学生信息
     * @return
     * @throws Exception
     */
    @Override
    public List<Student> queryStudent() throws Exception {
        Connection conn = getConnection();
        // 3.通过Connection对象获取Statement对象
        String sql = "select * from t_student";
        PreparedStatement ps = conn.prepareStatement(sql);
        // 4.使用Statement对象来执行Sql语句
        ResultSet rs = ps.executeQuery();
        // 5.操作结果集
        List<Student> list = new ArrayList<>();
        while(rs.next()){
            Student student = new Student();
            student.setNo(rs.getString("no"));
            student.setName(rs.getString("name"));
            student.setAge(rs.getInt("age"));
            list.add(student);
        }
        // 6.关闭连接，释放资源
        rs.close();
        ps.close();
        conn.close();
        return list;
    }
}
