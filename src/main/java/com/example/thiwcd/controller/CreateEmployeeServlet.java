package com.example.thiwcd.controller;

import com.example.thiwcd.entity.Employee;
import com.example.thiwcd.model.EmployeeModel;
import com.example.thiwcd.model.MysqlEmployeeModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateEmployeeServlet extends HttpServlet {

    private EmployeeModel employeeModel;
    @Override
    public void init() throws ServletException {
        employeeModel = new MysqlEmployeeModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/client/view/create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        String fullname = req.getParameter("fullname");
        String birthday = req.getParameter("birthday");
        String address = req.getParameter("address");
        String position = req.getParameter("position");
        String department = req.getParameter("department");
        Employee employee = new Employee(fullname, birthday,address,position,department);
        employeeModel.save(employee);
        resp.sendRedirect("/list");
    }
}
