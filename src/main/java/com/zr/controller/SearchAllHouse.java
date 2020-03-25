package com.zr.controller;
import com.zr.model.HouseInfo;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SearchAllHouse extends HttpServlet {
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
        List<HouseInfo> list_house = new ArrayList<HouseInfo>();
        HouseInfo houseInfo = new HouseInfo();
        HouseInfo houseInfo2 = new HouseInfo();
        houseInfo.setDanyuan("一单元");
        houseInfo.setFangjian("B-3");
        houseInfo.setHouseid("1265");
        houseInfo.setLouceng("16");
        houseInfo.setUname("卡黑");
        houseInfo.setLandnum("200285727284");
        houseInfo2.setDanyuan("二单元");
        houseInfo2.setFangjian("A-8");
        houseInfo2.setHouseid("2123");
        houseInfo2.setLouceng("8");
        houseInfo2.setUname("");
        houseInfo2.setLandnum("125125125123");
        list_house.add(houseInfo);
        list_house.add(houseInfo2);
        list_house.add(houseInfo);
        list_house.add(houseInfo2);
        list_house.add(houseInfo);
        list_house.add(houseInfo2);
        list_house.add(houseInfo);
        list_house.add(houseInfo2);

        JSONObject data=new JSONObject();//创建返回数据 json对象 data
        data.put("successcode",200);
        data.put("total",list_house.size());
        data.put("rows",list_house);
        out.write(data.toString()); //data转换成json 字符串返回给前端
        out.flush();
        out.close();//完成返回，关闭读写流
    }

}
