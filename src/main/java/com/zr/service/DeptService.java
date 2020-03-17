package com.zr.service;

import java.util.List;

import com.zr.dao.Dao;
import com.zr.model.DeptInfo;
import com.zr.model.UserInfo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class DeptService {
	
	private Dao dao = new Dao();
	
	public boolean addDeptService(String deptName,String describe) {
		
		return dao.addDept(deptName, describe);
	}
	
	public JSONObject searchDeptService(String deptName) {
		JSONObject tree = new JSONObject();
		List<DeptInfo> list = dao.getAllDept(deptName);
		tree.put("total", list.size());
		tree.put("rows", list);
		return tree;
	}
	
	public boolean deleteDeptService(String did) {
		
		JSONArray json = JSONArray.fromObject(did);	
		for (int i=0;i < json.size();i++) {
			JSONObject tree = json.getJSONObject(i);
			dao.deleteDept(tree.getString("did"));
		}
		return true;
		
	}
}
