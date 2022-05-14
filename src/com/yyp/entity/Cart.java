package com.yyp.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/*
 * 数据库对应的购物车表
 * */
public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;

    private int cid;
    private int uid;
    private int pid;
    private int cnum;           //购物车商品数量
    private BigDecimal ccount;  //购物车小计

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getCnum() {
        return cnum;
    }

    public void setCnum(int cnum) {
        this.cnum = cnum;
    }

    public BigDecimal getCcount() {
        return ccount;
    }

    public void setCcount(BigDecimal ccount) {
        this.ccount = ccount;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cid=" + cid +
                ", uid=" + uid +
                ", pid=" + pid +
                ", cnum=" + cnum +
                ", ccount=" + ccount +
                '}';
    }
}
