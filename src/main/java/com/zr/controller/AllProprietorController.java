package com.zr.controller;

import com.zr.model.SuggInfo;
import net.sf.json.JSONObject;
import com.zr.model.ProprietorInfo;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AllProprietorController extends HttpServlet {
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
        String res = "true";
        List<ProprietorInfo> list_pro = new ArrayList<ProprietorInfo>();
        ProprietorInfo proprietorInfo=new ProprietorInfo();
        ProprietorInfo proprietorInfo2=new ProprietorInfo();
        proprietorInfo.setDanyuan("2单元");
        proprietorInfo.setFangjian("B-3");
        proprietorInfo.setLouceng("16");
        proprietorInfo.setLandnum("2175462141");
        proprietorInfo.setName("猫咖白");
        proprietorInfo.setUname("卡白");
        proprietorInfo.setPid("1");
        proprietorInfo.setPhone("13658249621");
        proprietorInfo2.setDanyuan("6单元");
        proprietorInfo2.setFangjian("A-1");
        proprietorInfo2.setLouceng("6");
        proprietorInfo2.setLandnum("21712415462141");
        proprietorInfo2.setName("白猫卡");
        proprietorInfo2.setUname("白卡");
        proprietorInfo2.setPhone("15796454957");
        proprietorInfo2.setPid("2");
        list_pro.add(proprietorInfo);
        list_pro.add(proprietorInfo2);
        JSONObject data = new JSONObject();
        data.put("successcode", 200);
        data.put("total", list_pro.size());
        data.put("rows", list_pro);
        out.write(data.toString());
        out.flush();
        out.close();
    }

}
