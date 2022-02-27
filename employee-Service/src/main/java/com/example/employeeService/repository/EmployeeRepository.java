package com.example.employeeService.repository;

import com.example.employeeService.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    Employee findEmployeeById(String userId);
    Employee findEmployeeByDesignation(String designation);
}