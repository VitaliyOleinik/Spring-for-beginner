package com.springboot.spring_data_jpa.service;


import com.springboot.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
    public List<Employee> findAllByName(String name);
}
