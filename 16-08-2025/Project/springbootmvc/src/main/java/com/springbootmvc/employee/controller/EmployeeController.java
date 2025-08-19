package com.springbootmvc.employee.controller;

import com.springbootmvc.employee.model.Employee;
import com.springbootmvc.employee.model.Department;
import com.springbootmvc.employee.model.Address;
import com.springbootmvc.employee.repository.EmployeeRepository;
import com.springbootmvc.employee.repository.DepartmentRepository;
import com.springbootmvc.employee.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping
    public String showEmployees(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        model.addAttribute("employee", new Employee());
        return "employee"; // employee.html
    }

    @PostMapping
    public String addEmployee(@ModelAttribute Employee employee) {
        handleDepartmentAndAddress(employee);
        employeeRepository.save(employee);
        return "redirect:/employees";
    }

    private void handleDepartmentAndAddress(Employee employee) {
        if (employee.getDepartment() != null && employee.getDepartment().getName() != null) {
            Department dept = departmentRepository.findByName(employee.getDepartment().getName())
                    .orElseGet(() -> departmentRepository.save(new Department(employee.getDepartment().getName())));
            employee.setDepartment(dept);
        }
        if (employee.getAddress() != null) {
            employee.setAddress(addressRepository.save(employee.getAddress()));
        }
    }
}
