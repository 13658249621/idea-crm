package com.zr.dao;

import java.sql.*;

import com.zr.util.DBUtil;

public class User {
    public int login(String username, String password) {
        Connection conn = DBUtil.getConn();//从DButil获得连接
        Statement state = null;
        ResultSet rs = null;
        int flag = 0;
        try {
            String sql = "select * from user where uname ='" + username + "'";
            state = conn.createStatement();
            rs = state.executeQuery(sql);

            if (rs.next()) {
                if (rs.getString("password").equals(password)) {
                    flag = 1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs, state, conn);
        }
        return flag;
    }

}
