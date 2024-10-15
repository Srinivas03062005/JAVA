abstract class BankAccount 
{
    protected double balance=0.0;
    public abstract void addMoney(double amount);
    public abstract void withdrawMoney(double amount);
    public double getBalance() 
    {
        return balance;
    }
}
class SavingsAccount extends BankAccount 
{
    public void addMoney(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Added: $" + amount + ", New Balance: $" + balance);
        } else 
        {
            System.out.println("Amount to add must be positive.");
        }
    }
    public void withdrawMoney(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ", New Balance: $" + balance);
        } else if (amount > balance) 
        {
            System.out.println("Insufficient funds. Current Balance: $" + balance);
        } else 
        {
            System.out.println("Amount to withdraw must be positive.");
        }
    }
}
public class abstraction_codingexample 
{
    public static void main(String[] args) 
    {
        SavingsAccount account = new SavingsAccount();
        
        account.addMoney(200.0);
        account.withdrawMoney(150.0);
        account.withdrawMoney(1200.0); // Attempt to withdraw more than balance
        account.addMoney(-50.0); // Attempt to add negative amount
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
