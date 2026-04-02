class BankAccount {
    private String accountHolder;
    private double balance;
    public BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Keerthi", 5000);
        acc.deposit(2000);
        acc.withdraw(1000);
        System.out.println("Current Balance: ₹" + acc.getBalance());
           }
}