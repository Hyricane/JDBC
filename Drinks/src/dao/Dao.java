package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {

    public Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/drinks?useUnicode=true&characterEncoding=utf-8";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url,username,password);
        return conn;
    }
}
