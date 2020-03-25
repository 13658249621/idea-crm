package com.zr.controller;
import com.zr.model.NoticeInfo;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AllNoticeController extends HttpServlet {
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
        List<NoticeInfo> list_parking = new ArrayList<NoticeInfo>();
        NoticeInfo noticeInfo =new NoticeInfo();
        noticeInfo.setInfo("内容路径爱死你啦卡少女感思考过那送爱搜IG啊搜IG那艘asgasg李三公和阿森纳搞死搞四个那艘IG把搜狗笑死欧艾斯报告撕不过IG那艘Gina三国欧艾斯搞四个包四个班");
        noticeInfo.setNoticeid("2");
        noticeInfo.setDate("2020-03-04");
        noticeInfo.setTitle("标题");
        list_parking.add(noticeInfo);
        list_parking.add(noticeInfo);
        list_parking.add(noticeInfo);
        JSONObject data=new JSONObject();
        data.put("successcode",200);
        data.put("total",list_parking.size());
        data.put("rows",list_parking);
        out.write(data.toString());
        out.flush();
        out.close();
    }

}
