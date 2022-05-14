package com.yyp.service;

import com.yyp.entity.PageBean;
import com.yyp.entity.Product;

import java.sql.SQLException;

public interface ProductService {

    PageBean<Product> findPage(String tid, int page, int pageSize) throws SQLException;

    Product findProductByPid(String pid) throws SQLException;
}
