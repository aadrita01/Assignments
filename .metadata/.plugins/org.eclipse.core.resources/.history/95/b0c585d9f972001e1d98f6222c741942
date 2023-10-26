package assign1;
import java.util.*;

class InsufficientBalanceException extends Exception{
}
class IllegalBankTransactionException extends Exception{
}

    public class savingAccount {
	static long id;
    double balance;
    
    public savingAccount(long id, double balance) {
    	this.id = id;
        this.balance = balance;
        }

    public double withdraw(double amount)throws InsufficientBalanceException,IllegalBankTransactionException
    {
    	if(amount<0)
    	{
    		System.out.println("Cannot withdraw negative amount");
            throw new IllegalBankTransactionException();
        }
        if(amount>balance||balance<0)
        {
            System.out.println("Insufficient balance for withdrawal");
            throw new InsufficientBalanceException();
        }
        balance-=amount;
        return balance; 
     }
    
    public static void main(String[] args) 
    {
    	int balance=10000;
        Scanner sc=new Scanner(System.in);
        savingAccount obj=new savingAccount(id,balance);
        while(balance!=0)
        {
        try {
        	System.out.println("Enter amount to withdraw");
            double amount= sc.nextDouble();
            obj.withdraw(amount);
            System.out.println("*******************");
            System.out.println("Withdraw Successful");
            }
        catch(InsufficientBalanceException|IllegalBankTransactionException e) {
            System.out.println("Error:"+e);
            }
        }
        sc.close();

     }

}
