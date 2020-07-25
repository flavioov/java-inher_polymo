package Entities;

public class SavingsAccountImpl extends SavingsAccount {

    public SavingsAccountImpl(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance, interestRate);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount + 2;
    }
}
