package com.vitaliy.spring.sprinboot.spring_boot.service;

import com.vitaliy.spring.sprinboot.spring_boot.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeService {
    List<Employee>getAllEmployees();
}
