package ClassAssignment_3.Q3;

public class Account {
    private static int numAccounts;

    private int accountNumber;
    private AccountOwner owner;
    private double balance;

    public Account() {
        numAccounts += 1;
        accountNumber = numAccounts;
    }

    public Account(AccountOwner owner, double balance) {
        numAccounts += 1;
        accountNumber = numAccounts;
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static int getNumAccounts() {
        return numAccounts;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public AccountOwner getOwner() {
        return owner;
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
        return String.format("(Account Number: %d, Balance: %.2f)", accountNumber, balance);
    }
}
