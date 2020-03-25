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
        PayInfo payInfo2 = new PayInfo();
        payInfo2.setPayid("2");
        payInfo2.setPayname("物业管理费2");
        payInfo2.setPaytime("2020-03-16");
        payInfo2.setPrice("188");
        payInfo2.setState("已缴");
        payInfo2.setUname("卡黑");
        payInfo.setPayid("1");
        payInfo.setPayname("物业管理费1");
        payInfo.setPaytime("2020-03-10");
        payInfo.setPrice("1466");
        payInfo.setState("待缴");
        payInfo.setUname("卡白");
        list_parking.add(payInfo);
        list_parking.add(payInfo);
        list_parking.add(payInfo);
        list_parking.add(payInfo);
        list_parking.add(payInfo);
        list_parking.add(payInfo2);
        list_parking.add(payInfo2);
        list_parking.add(payInfo2);
        JSONObject data=new JSONObject();//创建返回数据 json对象 data
        data.put("successcode",200);
        data.put("total",list_parking.size());
        data.put("rows",list_parking);
        out.write(data.toString()); //data转换成json 字符串返回给前端
        out.flush();
        out.close();//完成返回，关闭读写流
    }

}
