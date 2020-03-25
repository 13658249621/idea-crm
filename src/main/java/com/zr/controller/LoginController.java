package com.zr.controller;
import net.sf.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginController extends HttpServlet {
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
		String uname = req.getParameter("uname");
		String password = req.getParameter("password");
		/*if (对比数据库用户名和密码正确){
		JSONObject data = new JSONObject();
		data.put("successcode", 200);//测试数据。successcode具体时间什么需要查询数据库对比uname和password是否正确
		data.put("message", "登录成功");//测试数据。具体是什么需要查询数据库对比用户名和密码是否正确
		data.put("power", "物业管理人员");//测试数据。power具体是什么需要查询数据库
		out.write(data.toString());
		out.flush();
		out.close();
 		}
 		else if(对比数据库用户名和密码错误){
 		JSONObject data = new JSONObject();
		data.put("successcode", 300);//测试数据。successcode具体时间什么需要查询数据库对比uname和password是否正确
		data.put("message", "用户名或密码错误");//测试数据。具体是什么需要查询数据库对比用户名和密码是否正确//测试数据。power具体是什么需要查询数据库
		out.write(data.toString());
		out.flush();
		out.close();
 		}
 		else if(对比数据库用户名不存在){返回用户名不存在的对应的数据}*/
		JSONObject data = new JSONObject();
		data.put("successcode", 200);//测试数据。successcode具体时间什么需要查询数据库对比uname和password是否正确
		data.put("message", "登录成功");//测试数据。具体是什么需要查询数据库对比用户名和密码是否正确
		data.put("power", "系统管理员");//测试数据。power具体是什么需要查询数据库
		out.write(data.toString());
		out.flush();
		out.close();
	}

}
