var employees=[
  { name: "John", role: "Manager", empId: 101, salary: 5000 },
  { name: "Mark", role: "Developer", empId: 102, salary: 4000 },
  { name: "Darker", role: "Manager", empId: 103, salary: 5500 },
  { name: "Srinu", role: "QA", empId: 104, salary: 3500 },
  { name: "Banten", role: "Manager", empId: 105, salary: 6000 }
];
var managers = employees.filter(emp => emp.role === "Manager");
var totalManagerSalary = managers.reduce((acc, emp) => acc + emp.salary, 0);
console.log("Total salary of all managers: " + totalManagerSalary);
