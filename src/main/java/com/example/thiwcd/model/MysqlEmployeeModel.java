package com.example.thiwcd.model;

import com.example.thiwcd.constant.MysqlConstant;
import com.example.thiwcd.entity.Employee;
import com.example.thiwcd.ulti.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MysqlEmployeeModel implements EmployeeModel{
    @Override
    public boolean save(Employee obj) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(MysqlConstant. EMPLOYEE_INSERT);
            preparedStatement.setString(1, obj.getFullName());
            preparedStatement.setString(2, obj.getBirthday());
            preparedStatement.setString(3, obj.getAddress());
            preparedStatement.setString(4, obj.getPosition());
            preparedStatement.setString(5, obj.getDepartment());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(int id, Employee obj) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(MysqlConstant.EMPLOYEE_FIND_ALL);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()) {
                int id = rs.getInt("id");
                String fullname = rs.getString("fullname");
                String birthday = rs.getString("birthday");
                String address = rs.getString("address");
                String position = rs.getString("position");
                String department = rs.getString("department");

                Employee employee = new Employee(id,fullname,birthday,address,position,department);
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
