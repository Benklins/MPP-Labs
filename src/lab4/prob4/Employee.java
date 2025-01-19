package lab4.prob4;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private final String name;


    private List<Account> accounts;


    public Employee(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {

        if (account == null) throw new IllegalArgumentException("Cannot create a null account");
        accounts.add(account);

    }

    public double computeUpdatedBalanceSum() {
        return accounts.stream()
                .map(Account::computeUpdatedBalance)
                .reduce(0.0, Double::sum);
    }
}
