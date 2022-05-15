package com.yyp.service.impl;

import com.yyp.dao.CartDao;
import com.yyp.dao.ProductDao;
import com.yyp.dao.impl.CartDaoImpl;
import com.yyp.dao.impl.ProductDaoImpl;
import com.yyp.entity.Cart;
import com.yyp.entity.Product;
import com.yyp.service.CartService;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public class CartServiceImpl implements CartService {
    @Override
    public void createCart(int uid, String pid) throws SQLException, InvocationTargetException, IllegalAccessException {
        //1.我们需要判断是否已经存在了！
        CartDao cartDao = new CartDaoImpl();

        Cart cart = cartDao.hasCart(uid,pid);

        if (cart != null) {
            //添加过了购物车！修改即可
            cart.setCnum(cart.getCnum()+1);
            cartDao.updateCart(cart);
        }else{
            //3.不存在添加即可
            //1.根据商品id查询商品
            ProductDao productDao = new ProductDaoImpl();
            Product product = productDao.selectProductByPid(pid);

            cart = new Cart();
            cart.setCnum(1);
            cart.setPid(Integer.parseInt(pid));
            cart.setProduct(product);
            cart.setUid(uid);

            cartDao.insertCart(cart);
        }
    }

    @Override
    public List<Cart> findAll(int uid) throws SQLException, InvocationTargetException, IllegalAccessException {
        CartDao cartDao = new CartDaoImpl();
        List<Cart> carts = cartDao.selectCartsByUid(uid);
        return carts;
    }

    @Override
    public void deleteCartByCid(String cid) throws SQLException {
        CartDao cartDao = new CartDaoImpl();
        cartDao.deleteCartByCid(cid);
    }

    @Override
    public void updateCartByCid(String cid, String price, String cnum) throws SQLException {
        BigDecimal cnumbig = new BigDecimal(cnum);
        BigDecimal pricebig = new BigDecimal(price);

        BigDecimal count = pricebig.multiply(cnumbig);

        CartDao cartDao = new CartDaoImpl();

        cartDao.updateByCid(count,cnumbig,cid);
    }

    @Override
    public void clearCart(String uid) throws SQLException {
        CartDao cartDao = new CartDaoImpl();
        cartDao.deleteCartByUid(uid);
    }
}
