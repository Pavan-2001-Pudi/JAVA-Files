/*27.Define the interface AccountOperation*/
interface AccountOperation {
    void deposit(double amount);

    double getBalance();
}

class Account implements AccountOperation {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

public class TwentySeven {
    public static void main(String[] args) {
        Account myAccount = new Account(1000);
        System.out.println("Initial Balance: " + myAccount.getBalance());
        myAccount.deposit(500);
        System.out.println("Balance after deposit: " + myAccount.getBalance());
    }
}
