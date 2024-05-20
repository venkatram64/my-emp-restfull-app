package com.venkat.emp.service.impl;

import com.venkat.emp.model.Employee;
import com.venkat.emp.repository.EmployeeRepository;
import com.venkat.emp.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmp(Employee employee){
        Employee empDb = this.employeeRepository.save(employee);
        return empDb;
    }

    public Employee updateEmp(Employee employee){
        Employee updatedEmp = this.employeeRepository.save(employee);
        return updatedEmp;
    }

    public List<Employee> getAllEmployees(){
        List<Employee> employees = this.employeeRepository.findAll();
        return employees;
    }

    public Employee getEmployeeById(Long id){
        Optional<Employee> emp = this.employeeRepository.findById(id);
        Employee employee = emp.get();
        return employee;
    }
}
