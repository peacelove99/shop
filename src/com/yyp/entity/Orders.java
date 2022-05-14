package com.yyp.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/*
 * 数据库对应的订单实体表
 * */
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    private String oid;
    private int uid;
    private int aid;
    private BigDecimal ocount;//订单的总金额
    private Date otime;    //订单的详细时间
    private int ostate;    //订单状态0未付款，1付块待发货，2发货待收货，3收货待评价，4订单完成，5退货

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public BigDecimal getOcount() {
        return ocount;
    }

    public void setOcount(BigDecimal ocount) {
        this.ocount = ocount;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    public int getOstate() {
        return ostate;
    }

    public void setOstate(int ostate) {
        this.ostate = ostate;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oid='" + oid + '\'' +
                ", uid=" + uid +
                ", aid=" + aid +
                ", ocount=" + ocount +
                ", otime=" + otime +
                ", ostate=" + ostate +
                '}';
    }
}
