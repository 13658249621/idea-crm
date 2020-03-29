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

public class TestUser extends HttpServlet {
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
        String testuname = req.getParameter("testuname");
        if (testuname=="testuname"){
            JSONObject data = new JSONObject();
            data.put("test","geted");
            out.write(data.toString());
            out.flush();
            out.close();
        }
        else {
            JSONObject data = new JSONObject();
            data.put("test","NotGeted");
            out.write(data.toString());
            out.flush();
            out.close();
        }

    }

}
