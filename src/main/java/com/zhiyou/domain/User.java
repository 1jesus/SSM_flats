package com.zhiyou.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * @Classname User
 * @Date 2021/9/9 20:27
 */
@Component
public class User implements Serializable {
    private int uid;
    private String uname;
    private String upassword;
    private String urealname;
    private int uroid;
    private Date uaddTime;
    private int ustatus;

    //多表联查,携带关联表的数据
    private ArrayList<Role> roleList;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                ", urealname='" + urealname + '\'' +
                ", uroid=" + uroid +
                ", uaddTime=" + uaddTime +
                ", ustatus=" + ustatus +
                ", roleList=" + roleList +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUrealname() {
        return urealname;
    }

    public void setUrealname(String urealname) {
        this.urealname = urealname;
    }

    public int getUroid() {
        return uroid;
    }

    public void setUroid(int uroid) {
        this.uroid = uroid;
    }

    public Date getUaddTime() {
        return uaddTime;
    }

    public void setUaddTime(Date uaddTime) {
        this.uaddTime = uaddTime;
    }

    public int getUstatus() {
        return ustatus;
    }

    public void setUstatus(int ustatus) {
        this.ustatus = ustatus;
    }

    public ArrayList<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(ArrayList<Role> roleList) {
        this.roleList = roleList;
    }
}