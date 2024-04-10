package com.kodaschool.unittestdemo.employee.repository;


import com.kodaschool.unittestdemo.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}