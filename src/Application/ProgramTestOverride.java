package Application;

import Entities.Account;
import Entities.SavingsAccount;

public class ProgramTestOverride {
    public static void main(String[] args) {

        Account cc = new Account(1001, "Alex", 1000.0);
        cc.withdraw(200);
        System.out.println(cc.getBalance());

        SavingsAccount savingsCc = new SavingsAccount(1002, "Jose", 1000.0, 0.01);
        savingsCc.withdraw(200);
        System.out.println("@overridethe mehtod 'withdraw' inherited from Account, without a fee");
        System.out.println(savingsCc.getBalance());
    }
}
