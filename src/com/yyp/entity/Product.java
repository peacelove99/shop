package com.yyp.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/*
 * 数据库对应的商品实体表
 * */
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private int pid;
    private int tid;
    private String pname ; //商品的名称
    private Date ptime;    //商品的上市时间
    private String pimage; //商品图片的路径
    private BigDecimal pprice; //商品的价格
    private int pstate;    //商品的热门指数
    private String pinfo;  //商品的描述

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    public BigDecimal getPprice() {
        return pprice;
    }

    public void setPprice(BigDecimal pprice) {
        this.pprice = pprice;
    }

    public int getPstate() {
        return pstate;
    }

    public void setPstate(int pstate) {
        this.pstate = pstate;
    }

    public String getPinfo() {
        return pinfo;
    }

    public void setPinfo(String pinfo) {
        this.pinfo = pinfo;
    }

    @Override
    public String toString() {
        return "product{" +
                "pid=" + pid +
                ", tid=" + tid +
                ", pname='" + pname + '\'' +
                ", ptime=" + ptime +
                ", pimage='" + pimage + '\'' +
                ", pprice=" + pprice +
                ", pstate=" + pstate +
                ", pinfo='" + pinfo + '\'' +
                '}';
    }
}
