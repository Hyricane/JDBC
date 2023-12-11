package com.wfit.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {

    public Connection getConnection()throws Exception{
        // 1.加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2.创建连接对象
        String url = "jdbc:mysql://127.0.0.1:3306/student?useUnicode=true&characterEncoding=utf-8";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }

}
