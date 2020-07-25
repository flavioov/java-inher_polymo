package Application;

import Entities.Account;
import Entities.BusinessAccount;

import javax.sound.midi.Soundbank;

public class ProgramTestSuperOverride {

    public static void main(String[] args) {


        Account acc = new Account(1, "Ana", 1000.0);
        acc.withdraw(200);
        System.out.println("Withdraw with Account");
        System.out.println(acc.getBalance());


        Account acc2 = new BusinessAccount(2, "Flávio", 1000.0, 500.0);
        acc2.withdraw(200.0);
        System.out.println("Withdraw with BusinessAccount");
        System.out.println("withdraw method (account) + BusinessAccount method (super.withdraw + tax)");
        System.out.println(acc2.getBalance());

    }
}
