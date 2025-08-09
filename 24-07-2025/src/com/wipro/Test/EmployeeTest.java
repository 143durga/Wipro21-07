package com.wipro.Test;
import com.wipro.collections.Employee;
import java.util.concurrent.CopyOnWriteArrayList;
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CopyOnWriteArrayList<Employee> empList = new CopyOnWriteArrayList<>();

	        empList.add(new Employee("1", "Ravi", 28, 75000));
	        empList.add(new Employee("2", "Sneha", 32, 85000));
	        empList.add(new Employee("3", "Amit", 30, 60000));
	        empList.add(new Employee("4", "Nina", 27, 90000));

	        for (Employee emp : empList) {
	            if (emp.getEmpSalary() > 80000) {
	                empList.remove(emp);
	            }
	        }
	        System.out.println("Employees earning ₹80,000 or less:");
	        for (Employee emp : empList) {
	            System.out.println(emp);
	        }
	}

}
