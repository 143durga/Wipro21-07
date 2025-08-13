let personlist = [
  { name: "Alice", age: 22, city: "New York" },
  { name: "Bob", age: 17, city: "Los Angeles" },
  { name: "Charlie", age: 19, city: "Chicago" },
  { name: "David", age: 16, city: "Houston" },
  { name: "Eva", age: 25, city: "Phoenix" }
];

// Use map to add status without spread operator
let updatedPersonlist = personlist.map(person => {
  person.status = person.age >= 18 ? "Adult" : "Minor";
  return person;
});

console.log(updatedPersonlist);
