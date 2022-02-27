package com.example.employeeService.controller;

import com.example.employeeService.entity.Employee;
import com.example.employeeService.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable("id") String employeeId){
        return employeeService.findEmployeeById(employeeId);
    }
//    search by designation, trial
    @GetMapping("/{designation}")
    public Employee findEmployeeByDesignation(@PathVariable("designation") String desig){
        return employeeService.findEmployeeById(desig);
    }
}