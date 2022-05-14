package com.yyp.service.impl;

import com.yyp.dao.TypeDao;
import com.yyp.dao.impl.TypeDaoImpl;
import com.yyp.entity.Type;
import com.yyp.service.TypeService;

import java.sql.SQLException;
import java.util.List;

public class TypeServiceImpl implements TypeService {
    @Override
    public List<Type> findAll() throws SQLException {
        TypeDao typeDao = new TypeDaoImpl();

        List<Type> types = typeDao.selectAll();

        return types;
    }
}
