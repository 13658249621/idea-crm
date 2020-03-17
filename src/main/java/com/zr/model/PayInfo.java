package com.zr.model;

public class PayInfo {
    private String payid;
    private String uname;
    private String state;
    private String price;
    private String paytime;
    private String payname;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }

    public String getPayname() {
        return payname;
    }

    public void setPayname(String payname) {
        this.payname = payname;
    }

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime;
    }

    public PayInfo() {

    }

    public PayInfo(String price, String uname, String state,String payid,String payname,String paytime) {
        super();
        this.payid=payid;
        this.payname=payname;
        this.paytime=paytime;
        this.price = price;
        this.uname = uname;
        this.price = price;
        this.state = state;
    }

}
