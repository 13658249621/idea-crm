package com.zr.util;
import java.sql.*;

public class SqlBean {

    //JDBC连接
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/crm?characterEncoding=utf8&useSSL=false";

    //用户名和密码
    static final String USER = "root";
    static final String PASS = "root";

    public Connection getConnection(){
        try {
            Class.forName(JDBC_DRIVER); //加载驱动
            return DriverManager.getConnection(DB_URL,USER,PASS);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }

    }

}
