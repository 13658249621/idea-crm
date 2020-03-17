package com.zr.controller;

import com.zr.service.FixService;
import com.zr.service.WorkerService;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddFixServlet extends HttpServlet {
    private FixService fixService=new FixService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        String danyuan=req.getParameter("danyuan");
        String fangjian=req.getParameter("fangjian");
        String louceng=req.getParameter("louceng");
        String date=req.getParameter("date");
        String res="true";
        JSONObject data=new JSONObject();
        data.put("successcode",200);
        data.put("message","success");
        fixService.addFixService(danyuan,louceng,fangjian,date);
        resp.getWriter().write(String.valueOf(data));
        out.flush();
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

}
