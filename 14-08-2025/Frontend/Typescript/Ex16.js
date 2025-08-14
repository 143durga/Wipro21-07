//  Create a list of employees
var employees = [
    { empId: 101, empName: "Durga", salary: 50000 },
    { empId: 102, empName: "Bhavani", salary: 55000 },
    { empId: 103, empName: "Ramesh", salary: 60000 }
];
//  Function to print employees and return count
function printEmployees(empList) {
    for (var _i = 0, empList_1 = empList; _i < empList_1.length; _i++) {
        var emp = empList_1[_i];
        console.log("ID: ".concat(emp.empId, ", Name: ").concat(emp.empName, ", Salary: ").concat(emp.salary));
    }
    return empList.length;
}
//  Call the function
var count = printEmployees(employees);
console.log("Total Employees:", count);
