let persons = [
  { name: "Anil", age: 22, city: "New York" },
  { name: "Bobby", age: 17, city: "Los Angeles" },
  { name: "Chandu", age: 19, city: "Chicago" },
  { name: "David", age: 16, city: "Houston" },
  { name: "Daniel", age: 25, city: "Phoenix" }
];
let eligibleVoters = persons.filter(person => person.age >= 18);
eligibleVoters.forEach(person => {
  console.log(person);
});