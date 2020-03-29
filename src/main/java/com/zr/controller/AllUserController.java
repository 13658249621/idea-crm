package com.zr.controller;
import com.zr.model.User;
import com.zr.model.UserInfo;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AllUserController extends HttpServlet {
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
        String testuname=req.getParameter("testuname");
        String testuid=req.getParameter("testuid");
        String res = "true";
        List<UserInfo> list_user = new ArrayList<UserInfo>();
        UserInfo userInfo = new UserInfo();
        UserInfo userInfo2 = new UserInfo();
        UserInfo userInfo3 = new UserInfo();
        userInfo.setPassword("Ilove561314.");
        userInfo.setPower("系统管理员");
        userInfo.setUid("1");
        userInfo.setUname("管理员1");
        userInfo2.setPassword("5611314Ilove.");
        userInfo2.setPower("物业管理人员");
        userInfo2.setUid("2");
        userInfo2.setUname("物业管理人员1");
        userInfo3.setPassword("561Ilove1314.");
        userInfo3.setPower("业主");
        userInfo3.setUid("3");
        userInfo3.setUname("业主1");
        JSONObject data = new JSONObject();
        if (testuid == "1"){
            list_user.add(userInfo);
            list_user.add(userInfo);
            data.put("successcode", 200);
            data.put("total", list_user.size());
            data.put("rows", list_user);
            out.write(data.toString());
            out.flush();
            out.close();
        }
        else {
            list_user.add(userInfo);
            list_user.add(userInfo2);
            list_user.add(userInfo3);
            data.put("successcode", 200);
            data.put("total", list_user.size());
            data.put("rows", list_user);
            out.write(data.toString());
            out.flush();
            out.close();
        }




    }

}
