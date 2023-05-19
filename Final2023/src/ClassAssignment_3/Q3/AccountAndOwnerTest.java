package ClassAssignment_3.Q3;

import java.util.Random;

public class AccountAndOwnerTest {

    public static void main(String[] args) {
        AccountOwner owner1 = new AccountOwner("Alice");
        AccountOwner owner2 = new AccountOwner("Bob");

        owner1.createAccount(1000);
        owner2.createAccount(2000);
        owner2.createAccount(3000);
        owner1.createAccount(4000);
        owner1.createAccount(5000);

        System.out.println(owner1);
        System.out.println(owner2);

        Random rand = new Random(2150);

        for (Account account : owner1.getAccounts()) {
            owner1.deposit(account,rand.nextDouble() * 100);
        }

        for (Account account : owner2.getAccounts()) {
            owner1.deposit(account,rand.nextDouble() * 100);
        }

        for (Account account : owner2.getAccounts()) {
            owner2.withdraw(account,rand.nextDouble() * 100);
        }

        owner2.setName("Brian");

        owner2.withdraw(owner1.getAccounts().get(0), 1000);

        System.out.println(owner1);
        System.out.println(owner2);

    }

}
