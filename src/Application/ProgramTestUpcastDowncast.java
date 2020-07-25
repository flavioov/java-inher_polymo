package Application;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class ProgramTestUpcastDowncast {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);


        /*
         * UPCASTING
         * super class recives object from sub classes (BusinessAccount, SavingsAccount)
         * */

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        /*
         * DOWNCASTING
         * subclass recives objects from a super class
         *
         * The  convertioin it is not natural.
         *
         * Manually it is possible - seting the type before the super type
         * Ex. BusinessAccount acc4 = (BusinessAccount) acc2;

         * */

        BusinessAccount acc4 = (BusinessAccount) acc2;
//        acc2.loan();
        acc4.loan(100);

        /*
         * this operation is not permited
         *
         * The compilator does not identify this exception
         *
         * the
         * */

//        BusinessAccount acc5 = (BusinessAccount) acc3;

        /*
         * The object must be tested before the downcasting
         * */

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(100);
            System.out.println("Loan!");
        } else if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }


    }
}
