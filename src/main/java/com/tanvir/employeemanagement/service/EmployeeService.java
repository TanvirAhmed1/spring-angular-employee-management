package com.tanvir.employeemanagement.service;

import com.tanvir.employeemanagement.model.Employee;
import com.tanvir.employeemanagement.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
}
