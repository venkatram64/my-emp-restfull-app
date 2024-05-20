package com.venkat.emp.service;

import com.venkat.emp.model.Employee;

import java.util.List;


public interface EmployeeService {
    Employee createEmp(Employee employee);

    Employee updateEmp(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);
}
