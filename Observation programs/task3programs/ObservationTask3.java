
    import java.util.Scanner;

// create customized  exceptions
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidUPIException extends Exception {
    InvalidUPIException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

// interface for services tom provide
interface PaymentService {
    void pay(String receiverUpiId, double amount)
            throws InvalidUPIException, InvalidAmountException, InsufficientBalanceException;
    void checkBalance();
}

// to check the walletfor balance
class Wallet {
    // private data members -> encapsulation
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    public Wallet(String userName, String mobileNumber, String upiId, double initialBalance) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = initialBalance;
    }

    public void addMoney(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount: Amount must be positive.");
        }
        balance += amount;
        System.out.println("Amount added successfully. New Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void deductBalance(double amount) {
        balance -= amount;
    }

    public String getUpiId() {
        return upiId;
    }

    public String getUserName() {
        return userName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void displayWalletDetails() {
        System.out.println("\n----- Wallet Details -----");
        System.out.println("User Name     : " + userName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("UPI ID        : " + upiId);
        System.out.println("Balance       : " + balance);
        System.out.println("---------------------------");
    }
}

// class is implents the interfaces
class UPIPayment implements PaymentService {
    private Wallet wallet;

    public UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    // Validate UPI ID format: must contain '@' and not be empty on either side
    private boolean isValidUPI(String upiId) {
        if (upiId == null || upiId.isEmpty()) return false;
        int atIndex = upiId.indexOf('@');
        if (atIndex <= 0 || atIndex == upiId.length() - 1) return false;
        return true;
    }

    @Override
    public void pay(String receiverUpiId, double amount)
            throws InvalidUPIException, InvalidAmountException, InsufficientBalanceException {

        // 1. Validate UPI ID
        if (!isValidUPI(receiverUpiId)) {
            throw new InvalidUPIException("Invalid UPI ID: " + receiverUpiId);
        }

        // 2. Validate amount
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount: Payment amount must be positive.");
        }

        // 3. Check balance
        if (amount > wallet.getBalance()) {
            throw new InsufficientBalanceException("Insufficient balance for this transaction.");
        }

        // 4. Deduct and confirm
        wallet.deductBalance(amount);
        System.out.println("Payment of " + amount + " to " + receiverUpiId + " successful!");
    }

    @Override
    public void checkBalance() {
        System.out.println("Available Balance: " + wallet.getBalance());
    }
}

public class ObservationTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create wallet
        System.out.println("----- Create Wallet -----");
        System.out.print("Enter User Name: ");
        String name = sc.next();
        System.out.print("Enter Mobile Number: ");
        String mobile = sc.next();
        System.out.print("Enter UPI ID: ");
        String upiId = sc.next();

        Wallet wallet = new Wallet(name, mobile, upiId, 0.0);
        PaymentService paymentService = new UPIPayment(wallet); // interface reference

        // Add money
        System.out.print("\nEnter amount to add to wallet: ");
        double addAmount = sc.nextDouble();
        try {
            wallet.addMoney(addAmount);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Make a payment
        System.out.print("\nEnter receiver UPI ID for payment: ");
        String receiverUpi = sc.next();
        System.out.print("Enter payment amount: ");
        double payAmount = sc.nextDouble();

        try {
            paymentService.pay(receiverUpi, payAmount);
        } catch (InvalidUPIException e) {
            System.out.println("Transaction Failed - " + e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println("Transaction Failed - " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed - " + e.getMessage());
        } finally {
            System.out.println("Transaction attempt completed.");
        }

        // Final details
        paymentService.checkBalance();
        wallet.displayWalletDetails();

        sc.close();
    }
}

