package com.vitaliy.spring.sprinboot.spring_boot.service;

import com.vitaliy.spring.sprinboot.spring_boot.dao.EmployeeDAO;
import com.vitaliy.spring.sprinboot.spring_boot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDAO employeeDAO;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
