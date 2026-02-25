package Assignment.module3;
class BankAccount {
    private int accountNumber;
    private double balance;
    BankAccount(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
public class Bankdemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(12345, 1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.displayBalance();
    }
}
