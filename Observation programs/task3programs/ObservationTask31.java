class Account {
    private String accountnumber;
    private String accountholder;
    public double balance;

    // Constructor
    public Account(String accountnumber, String accountholder, double balance) {
        this.accountnumber = accountnumber;
        this.accountholder = accountholder;
        this.balance = balance;
    }

    // Getters
    public String getaccountnumber() {
        return accountnumber;
    }

    public String getaccountholder() {
        return accountholder;
    }

    public double getbalance() {
        return balance;
    }

    // Deposit
    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero");
        } else {
            balance = balance + amount;
            System.out.println("Deposited amount is " + amount);
        }
    }

    // Withdraw
    void withdraw(double amount) {
        System.out.println("Withdrawal operation");
    }

    // Calculate interest
    void calinterest() {
        System.out.println("Interest calculation");
    }

    // Transfer
    void transfer(Account fixedAccount, double amount) {
        System.out.println("Transfer of " + amount + " from "
                + accountnumber + " to "
                + fixedAccount.getaccountnumber());

        this.withdraw(amount);
        fixedAccount.deposit(amount);
    }

    // Display
    void show() {
        System.out.println("ACCOUNT NUMBER IS " + accountnumber);
        System.out.println("ACCOUNT HOLDER IS " + accountholder);
        System.out.println("BALANCE IS " + balance);
    }
}


// Savings Account
class SavingsAccount extends Account {
    private double interestrate;

    public SavingsAccount(String accountnumber, String accountholder,
                           double balance, double interestrate) {

        super(accountnumber, accountholder, balance);
        this.interestrate = interestrate;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount is not possible");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdraw is " + amount);
        }
    }

    @Override
    void calinterest() {
        double interest = balance * interestrate;
        balance = balance + interest;

        System.out.println("Interest is credited: " + interest);
    }
}


// Current Account
class CurrentAccount extends Account {
    private double overdraftlimit;

    public CurrentAccount(String accountnumber, String accountholder,
                           double balance, double overdraftlimit) {

        super(accountnumber, accountholder, balance);
        this.overdraftlimit = overdraftlimit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount is not possible");
        } else if (amount > balance + overdraftlimit) {
            System.out.println("Insufficient balance and overdraft limit exceeded");
        } else {
            balance = balance - amount;
            System.out.println("Withdraw is " + amount);
        }
    }

    @Override
    void calinterest() {
        double charge = 50.0;
        balance = balance - charge;

        System.out.println("Maintenance charge deducted: " + charge);
    }
}


// Main class
public class ObservationTask31 {
    public static void main(String[] args) {

        CurrentAccount ca =
                new CurrentAccount("UB 24311", "kumar", 4500, 2000);

        SavingsAccount sa =
                new SavingsAccount("SB 24533", "hemanth", 5000, 0.04);

        System.out.println("INITIAL ACCOUNT DETAILS");

        ca.show();

        System.out.println();

        sa.show();

        System.out.println();
        System.out.println("TRANSACTION DETAILS");

        ca.deposit(2000);

        ca.withdraw(2500);

        ca.calinterest();

        sa.withdraw(3000);

        sa.calinterest();

        sa.transfer(ca, 1000);

        System.out.println();
        System.out.println("FINAL ACCOUNT DETAILS");

        ca.show();

        System.out.println();

        sa.show();
    }
}