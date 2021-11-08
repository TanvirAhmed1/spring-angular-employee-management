package com.tanvir.employeemanagement.repo;

import com.tanvir.employeemanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmploueeById(Long id);

    Optional findEmployeeById(Long id);
}
