package com.zr.model;

public class SuggInfo {
    private String suggid;
    private String phone;
    private String uname;
    private String state;
    private String info;
    private String type;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSuggid() {
        return suggid;
    }

    public void setSuggid(String suggid) {
        this.suggid = suggid;
    }

    public SuggInfo() {

    }

    public SuggInfo(String suggid, String uname,String info,String state,String type, String phone) {
        super();
        this.suggid =suggid;
        this.uname= uname;
        this.info = info;
        this.state= state;
        this.type=type;
        this.phone=phone;
    }

}
