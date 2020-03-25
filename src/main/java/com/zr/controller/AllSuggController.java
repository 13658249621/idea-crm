package com.zr.controller;

import com.zr.model.SuggInfo;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AllSuggController extends HttpServlet {
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
        List<SuggInfo> list_sugg = new ArrayList<SuggInfo>();
        SuggInfo suggInfoInfo = new SuggInfo();
        SuggInfo suggInfoInfo2 = new SuggInfo();
        suggInfoInfo.setInfo("快解散噶事爱就是不噶搜和结果把ski哦噶搜不噶搜一百个哦和爱上不该是个保湿八嘎拉数据库八嘎及时公布阿贾克斯八嘎会计师报告爱死机看过吧司空见惯八十爱看世界杯gas科技馆巴士控股暗示健康报告卡技术报告");
        suggInfoInfo.setPhone("13658249621");
        suggInfoInfo.setState("待处理");
        suggInfoInfo.setType("建议");
        suggInfoInfo.setSuggid("1");
        suggInfoInfo.setUname("卡白");

        suggInfoInfo2.setInfo("快解散噶事爱就是不噶搜和结果把ski哦噶搜不噶搜一百个哦和爱上不该是个保湿八嘎拉数据库八嘎及时公布阿贾克斯八嘎会计师报告爱死机看过吧司空见惯八十爱看世界杯gas科技馆巴士控股暗示健康报告卡技术报告");
        suggInfoInfo2.setPhone("15796457924");
        suggInfoInfo2.setState("已处理");
        suggInfoInfo2.setType("投诉");
        suggInfoInfo2.setSuggid("2");
        suggInfoInfo2.setUname("卡黑");
        list_sugg.add(suggInfoInfo);
        list_sugg.add(suggInfoInfo);
        list_sugg.add(suggInfoInfo);
        list_sugg.add(suggInfoInfo2);
        list_sugg.add(suggInfoInfo2);
        list_sugg.add(suggInfoInfo2);
        JSONObject data = new JSONObject();
        data.put("successcode", 200);
        data.put("total", list_sugg.size());
        data.put("rows", list_sugg);
        out.write(data.toString());
        out.flush();
        out.close();
    }

}
