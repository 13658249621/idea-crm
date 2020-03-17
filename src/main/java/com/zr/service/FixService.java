package com.zr.service;

import com.zr.dao.Dao;

public class FixService {
    private Dao dao=new Dao();
    public boolean addFixService(String danyuan,String louceng,String fangjian,String date) {

        return dao.addFix(danyuan,louceng,fangjian,date);
    }
}
