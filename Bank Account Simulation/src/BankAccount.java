public class BankAccount {
    private double balance = 1000.0;

    public void deposit(double amount) throws IllegalArgumentException{
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        else{
            this.balance += amount;
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        else{
            if(amount > this.balance){
                throw new InsufficientBalanceException();
            }else {
                this.balance -= amount;
            }
        }
    }
    //GETTER
    public double getBalance(){return this.balance;}
}
