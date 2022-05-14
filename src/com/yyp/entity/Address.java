package com.yyp.entity;

import java.io.Serializable;

/*
* 数据库对应的地址表
* */
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    private int aid;
    private int uid;
    private String aname;   //地址的收件人
    private String aphone;  //收件人电话
    private String adetail; //收件人详细地址
    private int    astste;  //是否是默认地址0不是1是

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone;
    }

    public String getAdetail() {
        return adetail;
    }

    public void setAdetail(String adetail) {
        this.adetail = adetail;
    }

    public int getAstste() {
        return astste;
    }

    public void setAstste(int astste) {
        this.astste = astste;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", uid=" + uid +
                ", aname='" + aname + '\'' +
                ", aphone='" + aphone + '\'' +
                ", adetail='" + adetail + '\'' +
                ", astste=" + astste +
                '}';
    }
}
