package com.vitaliy.spring.sprinboot.spring_boot.dao;

import com.vitaliy.spring.sprinboot.spring_boot.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee>getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
}
