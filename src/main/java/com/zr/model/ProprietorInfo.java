package com.zr.model;

public class ProprietorInfo {
    private String pid;
    private String uname;
    private String name;
    private String phone;
    private String landnum;
    private String danyuan;
    private String louceng;
    private String fangjian;
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLandnum() {
        return landnum;
    }

    public void setLandnum(String landnum) {
        this.landnum = landnum;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public ProprietorInfo() {

    }

    public ProprietorInfo(String pid, String uname, String name,String landnum,String danyuan,String louceng,String fangjian) {
        super();
        this.uname = uname;
        this.name=name;
        this.pid=pid;
        this.landnum=landnum;
        this.danyuan=danyuan;
        this.landnum=louceng;
        this.fangjian=fangjian;
    }

}
