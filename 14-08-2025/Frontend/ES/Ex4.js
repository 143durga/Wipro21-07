class BankAccount {
  constructor(accountNumber, balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  deposit(amount) {
    this.balance += amount;
    console.log(`Deposited: $${amount}. New Balance: $${this.balance}`);
  }

  withdraw(amount) {
    if (amount <= this.balance) {
      this.balance -= amount;
      console.log(`Withdrawn: $${amount}. New Balance: $${this.balance}`);
    } else {
      console.log("Insufficient balance!");
    }
  }
}

const myAccount = new BankAccount("INDB12345", 1000);
myAccount.deposit(500);   
myAccount.withdraw(300);  
myAccount.withdraw(2000); 
