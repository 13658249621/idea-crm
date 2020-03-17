package com.zr.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil
{
    public static String DRIVERNAME = "com.mysql.jdbc.Driver";
    public static String URL = "jdbc:mysql://localhost:3306/crm?characterEncoding=utf8&useSSL=true";
    public static String USER = "root";
    public static String PASSWORD = "root";
    public static Connection getConn()//获取连接，返回Connection类型，必须设置为static这样才能在其他类中使用
    {
        Connection conn=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");//加载驱动
            conn=DriverManager.getConnection(URL,USER,PASSWORD);//连接数据库
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }
    public static void close(Statement state,Connection conn)//关闭函数
    {
        if(state!=null)//只有状态和连接时，先关闭状态
        {
            try
            {
                state.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
        if(conn!=null)
        {
            try
            {
                conn.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
    public static void close(ResultSet rs,Statement state,Connection conn)
    {
        if(rs!=null)//有结果集，状态和连接时，先关闭结果集，在关闭状态，在关闭连接
        {
            try
            {
                rs.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
        if(state!=null)

        {
            try
            {
                state.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
        if(conn!=null)
        {
            try
            {
                conn.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

}
