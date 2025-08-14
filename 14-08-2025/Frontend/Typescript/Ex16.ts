interface Employee {
    empId: number;
    empName: string;
    salary: number;
}

const employees: Employee[] = [
    { empId: 101, empName: "Durga", salary: 50000 },
    { empId: 102, empName: "Bhavani", salary: 55000 },
    { empId: 103, empName: "Ramesh", salary: 60000 }
];

function printEmployees(empList: Employee[]): number {
    for (const emp of empList) {
        console.log(`ID: ${emp.empId}, Name: ${emp.empName}, Salary: ${emp.salary}`);
    }
    return empList.length;
}

const count = printEmployees(employees);
console.log("Total Employees:", count);
