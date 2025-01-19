package lab4.prob4;

public class SavingsAccount extends Account {

    private String accountId;

    private double balance;

    private double interestRate;


    public SavingsAccount(String accountId, double interestRate, double startBalance) {
        this.accountId = accountId;
        this.interestRate = interestRate;
        balance = startBalance;
    }


    @Override
    public String getAccountId() {
        return accountId;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance += balance * interestRate;
    }
}
