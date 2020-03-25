package com.zr.model;

public class NoticeInfo {
    private String noticeid;
    private String title;
    private String info;
    private String date;
    public String getNoticeid() { return noticeid; }
    public void setNoticeid(String noticeid) { this.noticeid = noticeid; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getInfo() { return info; }
    public void setInfo(String info) { this.info = info; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }


    public NoticeInfo() {

    }

    public NoticeInfo(String noticeid, String title,String info,String date) {
        super();
        this.noticeid = noticeid;
        this.title = title;
        this.info = info;
        this.date = date;
    }

}
