package com.zr.model;

public class FixInfo {
    private String fixid;
    private String louceng;
    private String danyuan;
    private String fangjian;
    private String phone;
    private String info;
    private String state;
    private String date;
    private String uname;
    public FixInfo() {

    }
    public FixInfo(String louceng, String danyuan, String fangjian, String date, String fixid, String info, String phone, String state,String uname) {
        super();
        this.louceng = louceng;
        this.danyuan = danyuan;
        this.fangjian = fangjian;
        this.date = date;
        this.fixid=fixid;
        this.info=info;
        this.state=state;
        this.uname=uname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getFixid() {
        return fixid;
    }

    public void setFixid(String fixid) {
        this.fixid = fixid;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDanyuan() {
        return danyuan;
    }

    public void setDanyuan(String danyuan) {
        this.danyuan = danyuan;
    }

    public String getLouceng() {
        return louceng;
    }

    public void setLouceng(String louceng) {
        this.louceng = louceng;
    }

    public String getFangjian() {
        return fangjian;
    }

    public void setFangjian(String fangjian) {
        this.fangjian = fangjian;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
