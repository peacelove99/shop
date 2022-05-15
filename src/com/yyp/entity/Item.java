package com.yyp.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/*
 * 数据库对应的订单项表
 * */
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    private int iid;
    private String oid;
    private int pid;
    private Product product;
    private BigDecimal icount;  //订单项的小计
    private int inum;           //订单项的数量

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getIcount() {
        return icount;
    }

    public void setIcount(BigDecimal icount) {
        this.icount = icount;
    }

    public int getInum() {
        return inum;
    }

    public void setInum(int inum) {
        this.inum = inum;
    }

    @Override
    public String toString() {
        return "Item{" +
                "iid=" + iid +
                ", oid='" + oid + '\'' +
                ", pid=" + pid +
                ", icount=" + icount +
                ", inum=" + inum +
                '}';
    }
}
