package com.yyp.controller;

import com.google.gson.Gson;
import com.yyp.entity.Type;
import com.yyp.service.TypeService;
import com.yyp.service.impl.TypeServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/type")
public class TypeController extends BaseServlet{

    public String findAll(HttpServletRequest request, HttpServletResponse response) throws SQLException {

        TypeService typeService = new TypeServiceImpl();
        List<Type> types = typeService.findAll();

        Gson gson = new Gson();
        String json = gson.toJson(types);

        return json;
    }
}
