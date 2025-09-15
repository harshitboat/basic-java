public class bankacc {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(101, 50000);
        acc.deposit(10000);
        acc.withdraw(20000);
        acc.showBalance();
    }
}

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Not enough balance!");
        }
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
