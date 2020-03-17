package com.zr.controller;
import com.zr.model.FixInfo;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SearchAllFixController extends HttpServlet {
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
        String res="true";
        List<FixInfo> list_parking = new ArrayList<FixInfo>();
        FixInfo fixInfo = new FixInfo();
        fixInfo.setDanyuan("3");
        fixInfo.setLouceng("16");
        fixInfo.setDate("2020-03-02");
        fixInfo.setFangjian("B2");
        fixInfo.setFixid("1");
        fixInfo.setInfo("需要修水管需要修水管需要修水管需要修水管需要修水管需要修水管需要修水管需需要修水管需要修水管");
        fixInfo.setPhone("13658249621");
        fixInfo.setState("待修");
        fixInfo.setUname("卡白");
        list_parking.add(fixInfo);
        list_parking.add(fixInfo);
        list_parking.add(fixInfo);
        list_parking.add(fixInfo);
        list_parking.add(fixInfo);
        list_parking.add(fixInfo);
        list_parking.add(fixInfo);
        list_parking.add(fixInfo);
        list_parking.add(fixInfo);
        list_parking.add(fixInfo);
        list_parking.add(fixInfo);

        JSONObject data=new JSONObject();
        data.put("successcode",200);
        data.put("total",list_parking.size());
        data.put("rows",list_parking);
        out.write(data.toString());
        out.flush();
        out.close();
    }

}
