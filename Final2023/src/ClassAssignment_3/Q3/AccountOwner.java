package ClassAssignment_3.Q3;

import java.util.ArrayList;

public class AccountOwner {

    private static int numOwners;

    private int ownerID;
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public AccountOwner(String name) {
        numOwners += 1;
        ownerID = numOwners;
        this.name = name;
    }

    public static int getNumOwners() {
        return numOwners;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createAccount(double balance) {
        Account account = new Account(this, balance);
        accounts.add(account);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        if (!account.getOwner().equals(this)) {
            System.out.println("Withdrawal denied: You are not the owner of the account");
            return;
        }

        account.withdraw(amount);
    }

    public double totalBalance() {
        double total = 0;

        for (Account account : accounts) {
            total += account.getBalance();
        }

        return total;
    }

    @Override
    public String toString() {
        return String.format("(OwnerID: %d, Name: %s, Accounts: %s, Total Balance: %.2f)", ownerID, name, accounts.toString(), totalBalance());
    }
}
