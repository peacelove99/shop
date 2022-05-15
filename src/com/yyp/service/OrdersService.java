package com.yyp.service;

import com.yyp.entity.Orders;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public interface OrdersService {
    void createOrder(String aid, String uid, String sum) throws SQLException, InvocationTargetException, IllegalAccessException;

    List<Orders> findOrdersByUid(int uid) throws SQLException, InvocationTargetException, IllegalAccessException;

    Orders findOrderByOid(String oid) throws SQLException, InvocationTargetException, IllegalAccessException;

    void updateStateByOid(String oid) throws SQLException;
}
