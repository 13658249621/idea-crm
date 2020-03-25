package com.zr.controller;

import com.zr.model.PostInfo;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class AllParkingInfoSeverlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, UnsupportedEncodingException {
        JSONObject data = new JSONObject();//创建返回数据json对象
        JSONObject ParkingInfo = new JSONObject();
        ParkingInfo.put("carNum",1);
        ParkingInfo.put("carNum",2);
        ParkingInfo.put("state","待售");
        ParkingInfo.put("state","已售");
        ParkingInfo.put("price","300/月");
        ParkingInfo.put("price","400/月");
        data.put("successcode",200);
        data.put("total",2);
        data.put("rows", ParkingInfo);
        resp.setContentType("text/html");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        String postName = req.getParameter("postName");
        out.write(data.toString());//给前端返回data数据
        out.flush();
        out.close();//关闭读写流
    }
}












