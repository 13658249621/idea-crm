package com.zr.controller;
import com.zr.model.PayInfo;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SearchAllPayController extends HttpServlet {
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
        List<PayInfo> list_parking = new ArrayList<PayInfo>();
        PayInfo payInfo = new PayInfo();
        payInfo.setPayid("1");
        payInfo.setPayname("物业管理费");
        payInfo.setPaytime("2020-03-10");
        payInfo.setPrice("1466");
        payInfo.setState("待缴");
        payInfo.setUname("卡白");
        list_parking.add(payInfo);
        list_parking.add(payInfo);
        list_parking.add(payInfo);
        list_parking.add(payInfo);
        list_parking.add(payInfo);
        list_parking.add(payInfo);
        list_parking.add(payInfo);
        list_parking.add(payInfo);

        JSONObject data=new JSONObject();
        data.put("successcode",200);
        data.put("total",list_parking.size());
        data.put("rows",list_parking);
        out.write(data.toString());
        out.flush();
        out.close();
    }

}
