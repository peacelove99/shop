package com.yyp.service.impl;

import com.yyp.dao.CartDao;
import com.yyp.dao.OrdersDao;
import com.yyp.dao.impl.CartDaoImpl;
import com.yyp.dao.impl.OrdersDaoImpl;
import com.yyp.entity.Cart;
import com.yyp.entity.Item;
import com.yyp.entity.Orders;
import com.yyp.service.OrdersService;
import com.yyp.utils.RandomUtils;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersServiceImpl implements OrdersService {
    @Override
    public void createOrder(String aid, String uid, String sum) throws SQLException, InvocationTargetException, IllegalAccessException {
        //1.创建一个订单对象进行保存
        Orders orders = new Orders();

        BigDecimal bsum = new BigDecimal(sum);

        String orderId = RandomUtils.createOrderId();
        orders.setOid(orderId);
        orders.setAid(Integer.parseInt(aid));
        orders.setUid(Integer.parseInt(uid));
        orders.setOtime(new Date());
        orders.setOcount(bsum);
        orders.setOstate(1); //未支付状态

        //2.保存订单
        OrdersDao ordersDao = new OrdersDaoImpl();
        ordersDao.insertOrders(orders);

        //3.将购物车转成订单项
        CartDao cartDao = new CartDaoImpl();
        List<Cart> carts = cartDao.selectCartsByUid(Integer.parseInt(uid));

        List<Item> items = new ArrayList<>();
        for (Cart cart : carts) {
            Item item = new Item();
            item.setOid(orderId);
            item.setPid(cart.getPid());
            item.setInum(cart.getCnum());
            item.setIcount(cart.getCcount());
            items.add(item);
        }

        //4.保存订单对应的订单项！
        ordersDao.insertItems(items);
        //5.清空购物车
        cartDao.deleteCartByUid(uid);
    }

    @Override
    public List<Orders> findOrdersByUid(int uid) throws SQLException, InvocationTargetException, IllegalAccessException {
        OrdersDao ordersDao = new OrdersDaoImpl();

        List<Orders> list = ordersDao.selectOrdersByUid(uid);
        return list;
    }

    @Override
    public Orders findOrderByOid(String oid) throws SQLException, InvocationTargetException, IllegalAccessException {
        OrdersDao ordersDao = new OrdersDaoImpl();
        //1.oid查询订单和订单地址信息
        //订单和地址
        Orders orders = ordersDao.selectOrdersByOid(oid);
        //2.oid对应的对应的订单项和商品信息
        //订单项和商品信息
        List<Item> items = ordersDao.selectItemsByOid(oid);

        //3.订单项集合设置给订单对象
        orders.setItems(items);

        return orders;
    }

    @Override
    public void updateStateByOid(String oid) throws SQLException {
        OrdersDao ordersDao = new OrdersDaoImpl();
        ordersDao.updateStateByOid(oid);
    }
}
