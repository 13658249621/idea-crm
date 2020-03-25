
package com.zr.controller;
import net.sf.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddParking extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        String uname = req.getParameter("uname");
        String password = req.getParameter("password");

        JSONObject data = new JSONObject();
        data.put("successcode", 200);//测试数据。successcode具体时间什么需要查询数据库对比uname和password是否正确
        data.put("message", "车位添加成功");//测试数据。具体是什么需要查询数据库对比用户名和密码是否正确
        out.write(data.toString());
        out.flush();
        out.close();
    }

}
