package com.wipro.employeedept.repository;

import com.wipro.employeedept.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
