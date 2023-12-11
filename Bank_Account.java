import java.util.ArrayList;
import java.util.List;

// Interface representing common account operations
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double getBalance();
}

// Bank class with a list of accounts and methods for adding them
class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Additional methods can be added as needed
    public void displayAccountDetails() {
        for (Account account : accounts) {
            System.out.println("Balance: " + account.getBalance());
        }
    }
}

// Implementation of the Account interface for Savings Account
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // Additional method specific to SavingsAccount
    public void addInterest() {
        balance += calculateInterest();
    }
}

// Implementation of the Account interface for Current Account
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Exceeded overdraft limit");
        }
    }

    @Override
    public double calculateInterest() {
        // Current accounts typically don't earn interest
        return 0;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // Additional method specific to CurrentAccount
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

// Example usage
public class Bank_Account {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(500, 100);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        savingsAccount.deposit(200);
        currentAccount.withdraw(300);

        // Display account details
        bank.displayAccountDetails();

        // Example of using specific methods
        if (savingsAccount instanceof SavingsAccount) {
            ((SavingsAccount) savingsAccount).addInterest();
        }

        // Display updated account details
        bank.displayAccountDetails();
    }
}
