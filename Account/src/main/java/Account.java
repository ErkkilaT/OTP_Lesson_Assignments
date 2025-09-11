public class Account {
    private double balance;
    public Account(){
        balance = 0.0;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public double withdraw(double amount){
        if(amount > balance){
            return 0.0;
        }
        else{
            balance -= amount;
            return amount;
        }
    }
    public double getBalance(){
        return balance;
    }
}
