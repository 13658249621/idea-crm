package com.zr.model;

public class ParkingInfo {
    private String parkingplace;
    private String uname;
    private String state;
    private String price;
    private String password;
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
    public String getParkingplace() {
        return parkingplace;
    }

    public void setParkingplace(String parkingplace) {
        this.parkingplace = parkingplace;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }


    public ParkingInfo() {

    }

    public ParkingInfo(String parkingplace, String uname,String price,String state) {
        super();
        this.parkingplace = parkingplace;
        this.uname = uname;
        this.price = price;
        this.state = state;
    }

}
