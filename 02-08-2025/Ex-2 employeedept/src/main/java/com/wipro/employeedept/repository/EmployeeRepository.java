package com.wipro.employeedept.repository;


import com.wipro.employeedept.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
