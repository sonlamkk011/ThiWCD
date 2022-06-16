package com.example.thiwcd.model;

import com.example.thiwcd.entity.Employee;

import java.util.List;

public interface EmployeeModel {
    boolean save(Employee obj);

    boolean update(int id, Employee obj);

    boolean delete(int id);

    List<Employee> findAll();
}
