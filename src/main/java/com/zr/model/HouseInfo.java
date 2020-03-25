package com.zr.model;

public class HouseInfo {
    private String houseid;
    private String uname;
    private String danyuan;
    private String louceng;
    private String fangjian;
    private String landnum;

    public String getFangjian() {
        return fangjian;
    }

    public void setFangjian(String fangjian) {
        this.fangjian = fangjian;
    }

    public String getLouceng() {
        return louceng;
    }

    public void setLouceng(String louceng) {
        this.louceng = louceng;
    }

    public String getDanyuan() {
        return danyuan;
    }

    public void setDanyuan(String danyuan) {
        this.danyuan = danyuan;
    }

    public String getLandnum() {
        return landnum;
    }

    public void setLandnum(String landnum) {
        this.landnum = landnum;
    }

    public String getHouseid() {
        return houseid;
    }

    public void setHouseid(String houseid) {
        this.houseid = houseid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }



    public HouseInfo() {

    }

    public HouseInfo(String houseid, String uname, String danyuan,String louceng,String fangjian,String landnum) {
        super();
        this.houseid=houseid;
        this.danyuan=danyuan;
        this.louceng=louceng;
        this.landnum = landnum;
        this.uname = uname;
        this.fangjian = fangjian;
    }

}
