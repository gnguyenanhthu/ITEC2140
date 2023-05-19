package ClassAssignment_3;

public class Account {
    private double balance;

    public Account() {

    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal denied: Amount to withdraw cannot exceed the balance");
            return;
        }

        balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("Balance: %.2f", balance);
    }
}
