package com.zhiyou.domain;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Classname House
 * @Date 2021/9/9 17:20
 */
@Component
public class House {

    private int hid;
    private String haddress;
    private String hfloor;
    private int hroomNum;
    private String harea;
    private String hdir;
    private int hdeco;
    private int hair;
    private double hprice;
    private int hrentStatus;
    private String himage;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date haddTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hupdateTime;

    @Override
    public String toString() {
        return "House{" +
                "hid=" + hid +
                ", haddress='" + haddress + '\'' +
                ", hfloor='" + hfloor + '\'' +
                ", hroomNum=" + hroomNum +
                ", harea='" + harea + '\'' +
                ", hdir='" + hdir + '\'' +
                ", hdeco=" + hdeco +
                ", hair=" + hair +
                ", hprice=" + hprice +
                ", hrentStatus=" + hrentStatus +
                ", himage='" + himage + '\'' +
                ", haddTime=" + haddTime +
                ", hupdateTime=" + hupdateTime +
                '}';
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getHaddress() {
        return haddress;
    }

    public void setHaddress(String haddress) {
        this.haddress = haddress;
    }

    public String getHfloor() {
        return hfloor;
    }

    public void setHfloor(String hfloor) {
        this.hfloor = hfloor;
    }

    public int getHroomNum() {
        return hroomNum;
    }

    public void setHroomNum(int hroomNum) {
        this.hroomNum = hroomNum;
    }

    public String getHarea() {
        return harea;
    }

    public void setHarea(String harea) {
        this.harea = harea;
    }

    public String getHdir() {
        return hdir;
    }

    public void setHdir(String hdir) {
        this.hdir = hdir;
    }

    public int getHdeco() {
        return hdeco;
    }

    public void setHdeco(int hdeco) {
        this.hdeco = hdeco;
    }

    public int getHair() {
        return hair;
    }

    public void setHair(int hair) {
        this.hair = hair;
    }

    public double getHprice() {
        return hprice;
    }

    public void setHprice(double hprice) {
        this.hprice = hprice;
    }

    public int getHrentStatus() {
        return hrentStatus;
    }

    public void setHrentStatus(int hrentStatus) {
        this.hrentStatus = hrentStatus;
    }

    public String getHimage() {
        return himage;
    }

    public void setHimage(String himage) {
        this.himage = himage;
    }

    public Date getHaddTime() {
        return haddTime;
    }

    public void setHaddTime(Date haddTime) {
        this.haddTime = haddTime;
    }

    public Date getHupdateTime() {
        return hupdateTime;
    }

    public void setHupdateTime(Date hupdateTime) {
        this.hupdateTime = hupdateTime;
    }
}
