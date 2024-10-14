/*31. Create an insufficientBalanceException Class with the message "Insufficient Balance X for withdrawal of Y". */

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(double balance, double withdrawalAmount) {
        super("Insufficient Balance " + balance + " for withdrawal of " + withdrawalAmount);
    }
}

// Example usage
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.00);

        try {
            account.withdraw(150.00); // This will throw the exception
        } catch (InsufficientBalanceException e) {
            System.err.println(e.getMessage());
        }
    }
}
