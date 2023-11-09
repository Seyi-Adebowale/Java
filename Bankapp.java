import java.util.ArrayList;

public class Bankapp {
    private ArrayList<Account> accounts;

    public Bankapp() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void performTransaction(int accountNumber, double amount, String transactionType) {
        Account account = findAccount(accountNumber);

        if (account == null) {
            System.out.println("Account number " + accountNumber + " doesn't exist.");
            return;
        }

        if (transactionType.equals("withdraw")) {
            account.withdraw(amount);
        } else if (transactionType.equals("deposit")) {
            account.deposit(amount);
        } else {
            System.out.println("Invalid transaction type.");
        }
    }

    public void checkBalance(int accountNumber) {
        Account account = findAccount(accountNumber);

        if (account == null) {
            System.out.println("Account number " + accountNumber + " doesn't exist.");
        } else {
            double balance = account.getBalance();
            System.out.println("Account number " + accountNumber + " - Balance: N" + balance);
        }
    }
}

class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public void setAccountNumber (int acctNumber){
        accountNumber = acctNumber;
    }
    public void setAccountHolder (String acctHolder){
        accountHolder = acctHolder;
    }
    public void setAccountBalance (double initialBal){
        balance = initialBal;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of N" + amount + " successful. New balance: N" + balance);
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of N" + amount + " successful. New balance: N" + balance);
    }
}