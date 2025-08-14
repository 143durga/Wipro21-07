class Util {
  
  // a) Get today's date in dd-mm-YYYY format
  getDate() {
    const today = new Date();
    const dd = String(today.getDate()).padStart(2, '0');
    const mm = String(today.getMonth() + 1).padStart(2, '0'); 
    const yyyy = today.getFullYear();
    return `${dd}-${mm}-${yyyy}`;
  }

  // b) Return value of PI
  getPIValue() {
    return Math.PI;
  }

  // c) Convert Celsius to Fahrenheit
  convertC2F(celsius) {
    return (celsius * 9/5) + 32;
  }

  // d) Get first n Fibonacci numbers
  getFibonacci(n) {
    let fib = [0, 1];
    for (let i = 2; i < n; i++) {
      fib.push(fib[i - 1] + fib[i - 2]);
    }
    return fib;
  }
}

const util = new Util();
console.log(util.getDate());         
console.log(util.getPIValue());      
console.log(util.convertC2F(0));     
console.log(util.getFibonacci(5));   
