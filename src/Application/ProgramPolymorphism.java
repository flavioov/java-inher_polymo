package Application;

import Entities.Account;
import Entities.SavingsAccount;

public class ProgramPolymorphism {
    public static void main(String[] args) {

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        /*
         * both variables are of same type
         *
         * However, each one points to a specific object of different types
         *
         * the same method will show a distinct behaviour for each variable
         * */

        x.withdraw(50);
        y.withdraw(50);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }

}
