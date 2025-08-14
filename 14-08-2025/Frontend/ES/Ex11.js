function separateFirstRest(...args) {
  const [first, ...rest] = args; 
  return { first, rest };
}

console.log(separateFirstRest(10, 20, 30, 40));
console.log(separateFirstRest("a", "b", "c"));

