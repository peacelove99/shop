package com.yyp.service.impl;

import com.yyp.dao.ProductDao;
import com.yyp.dao.impl.ProductDaoImpl;
import com.yyp.entity.PageBean;
import com.yyp.entity.Product;
import com.yyp.service.ProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    @Override
    public PageBean<Product> findPage(String tid, int page, int pageSize) throws SQLException {

        ProductDao productDao = new ProductDaoImpl();

        long count = productDao.selectCountByTid(tid); //查询总条数

        // limit (currentPage-1)*pageSize,pageSize;
        List<Product> list = productDao.selectProductByPage(page,pageSize,tid); //查询当前页对应的商品

        return new PageBean<>(list, page, pageSize, count);
    }

    @Override
    public Product findProductByPid(String pid) throws SQLException {

        ProductDao productDao = new ProductDaoImpl();

        Product product = productDao.selectProductByPid(pid);

        return product;
    }
}
