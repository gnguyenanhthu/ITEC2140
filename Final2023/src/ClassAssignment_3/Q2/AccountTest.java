package ClassAssignment_3.Q2;

import java.util.ArrayList;
import java.util.Random;

public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account();
        System.out.println(account1);
        ArrayList<Account> accounts = new ArrayList<>();

        Random rand = new Random(2150);

        for (int i = 0 ; i < 5; i++) {
            Account account = new Account(rand.nextDouble() * 1000000);
            accounts.add(account);
        }

        System.out.println(accounts);
        System.out.println(Account.getNumAccounts() + " accounts");
    }

    public static double averageBalance(ArrayList<Account> accounts) {
        double totalBalance = 0;

        for (Account account : accounts) {

        }

        return 0;
    }
}
