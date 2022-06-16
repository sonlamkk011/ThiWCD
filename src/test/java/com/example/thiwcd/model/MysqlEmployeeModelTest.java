package com.example.thiwcd.model;

import com.example.thiwcd.entity.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MysqlEmployeeModelTest {
    private EmployeeModel employeeModel;

    @BeforeEach
    void setUp() {
        employeeModel = new MysqlEmployeeModel();
    }
    @Test
    void save() {
        Employee employee = new Employee("lamson", "12-12-2001", "hanoi", "hoc sinh", "ccc1");
        assertEquals(true,employeeModel.save(employee));

    }

    @Test
    void findAll() {
        MysqlEmployeeModel mysqlEmployeeModel = new MysqlEmployeeModel();
        List<Employee> list = mysqlEmployeeModel.findAll() ;
        assertNotEquals(0, list.size());
    }
}