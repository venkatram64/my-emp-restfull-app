package com.venkat.emp.controller;

import com.venkat.emp.model.Employee;
import com.venkat.emp.service.EmployeeService;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    /*http://localhost:8080/emp
        {
            "empNo": "SV-123",
            "name": "Srijan"
        }
    */
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        Employee emp = this.employeeService.createEmp(employee);
        return ResponseEntity.ok(emp);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees = this.employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{empId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("empId") Long empId){
        Employee emp = this.employeeService.getEmployeeById(empId);
        return ResponseEntity.ok(emp);
    }
}
