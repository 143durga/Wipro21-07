let names = ["Durga", "Bhavani", "Ravi", "Suresh", "Anita", "Krishna"];

let longNames = names.filter(name => name.length > 5);
let upperLongNames = longNames.map(name => name.toUpperCase());

console.log(upperLongNames);
