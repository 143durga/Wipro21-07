var x = 4;  // global scope variable

const z = 9;  // constant variable

function f() {
  x = 9;     // changes the global x because var is global here
  let y = 8; // block scope variable, only inside function f()

  console.log("x in function is " + x); // 9
  console.log("y in function is " + y); // 8

  if (true) {
    let z = 18;  // this z shadows the global const z, only inside this if block
    console.log("y in if block is " + y);  // 8, y is accessible here
    console.log("z in if block is " + z);  // 18
  }

  console.log("z in function is " + z); // 9 (the global const z)
}

f();  // function call

console.log("x outside function is " + x);  // 9 (changed inside f)
console.log("z outside function is " + z);  // 9


