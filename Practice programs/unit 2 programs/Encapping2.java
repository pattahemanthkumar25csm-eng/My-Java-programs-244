class bankacc{
    private double balance;
     public bankacc( double initialBalance){
        balance = initialBalance;
    }
public double getBalance(){
    return balance;
}

void deposit (double amount){
    if (amount > 0)
    balance += amount;
}
void withdraw (double amount){

    if(amount > 0 && amount <= balance)
balance -= amount;
    }

}
public class Encapping2 {
    public static void main(String[] args) {
        bankacc acc = new bankacc(1000) ;
        acc.deposit(500);
        acc.withdraw(250);
        System.out.println(" balance amount is " + acc.getBalance());
    }
    
}
