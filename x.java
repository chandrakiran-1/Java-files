// Parent class (Encapsulation)
class Account {
    private String accountHolder;   // private variables
    private double balance;

    // Constructor
    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance (protected - child classes can access safely)
    protected void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdraw attempt");
        }
    }

    // Polymorphic method (to be overridden)
    public void calculateInterest() {
        System.out.println("Generic account has no specific interest calculation.");
    }
}

// Child class 1: Savings Account
class SavingsAccount extends Account {
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.04; // 4% interest
        System.out.println("Savings Account Interest: " + interest);
    }
}

// Child class 2: Current Account
class CurrentAccount extends Account {
    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.02; // 2% interest
        System.out.println("Current Account Interest: " + interest);
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        // Polymorphism: Parent reference -> Child object
        Account acc1 = new SavingsAccount("Alice", 10000);
        Account acc2 = new CurrentAccount("Bob", 20000);

        // Encapsulation: direct balance access is not allowed
        // System.out.println(acc1.balance); 

        // Using methods to interact
        acc1.deposit(2000);
        acc1.withdraw(500);

        acc2.deposit(3000);
        acc2.withdraw(1000);

        // Polymorphism in action
        acc1.calculateInterest(); // Calls SavingsAccount version
        acc2.calculateInterest(); // Calls CurrentAccount version

        System.out.println(acc1.getAccountHolder() + " Balance: " + acc1.getBalance());
        System.out.println(acc2.getAccountHolder() + " Balance: " + acc2.getBalance());
    }
}
