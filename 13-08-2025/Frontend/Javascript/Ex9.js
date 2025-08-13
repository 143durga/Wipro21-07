let agestatus = [
  { name: "Anil", age: 12, city: "New York" },
  { name: "Bobby", age: 17, city: "Los Angeles" },
  { name: "Chandu", age: 19, city: "Chicago" },
  { name: "David", age: 36, city: "Houston" },
  { name: "Daniel", age: 25, city: "Phoenix" }
];
for (let i = 0; i < agestatus.length; i++) {
  if (agestatus[i].age >= 18) {
    agestatus[i].status = "Adult";
  } else {
    agestatus[i].status = "Minor";
  }
}

console.log(agestatus);