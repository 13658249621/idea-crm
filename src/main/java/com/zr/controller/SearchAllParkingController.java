package com.zr.controller;
import com.zr.model.ParkingInfo;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SearchAllParkingController extends HttpServlet {
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
        List<ParkingInfo> list_parking = new ArrayList<ParkingInfo>();
        ParkingInfo parkingInfo = new ParkingInfo();
        ParkingInfo parkingInfo2 = new ParkingInfo();
        parkingInfo.setParkingplace("A-2");
        parkingInfo.setUname("");
        parkingInfo.setState("待售");
        parkingInfo.setPrice("300/月");
        parkingInfo2.setParkingplace("B-3");
        parkingInfo2.setUname("用户2");
        parkingInfo2.setState("已售");
        parkingInfo2.setPrice("800/月");
        list_parking.add(parkingInfo2);
        list_parking.add(parkingInfo2);
        list_parking.add(parkingInfo2);
        list_parking.add(parkingInfo);
        list_parking.add(parkingInfo);
        list_parking.add(parkingInfo);
        list_parking.add(parkingInfo);
        JSONObject data=new JSONObject();
        data.put("successcode",200);
        data.put("total",list_parking.size());
        data.put("rows",list_parking);
        out.write(data.toString());
        out.flush();
        out.close();
    }

}
