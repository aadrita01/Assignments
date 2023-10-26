package practice;

class InsufficientBalanceException extends Exception{
}

public class Q3 {
	double balance=1000;
	
	public double withdraw(double amount)throws InsufficientBalanceException
    {
    	
        if(amount>balance||balance<0)
        {
            System.out.println("Insufficient balance for withdrawal");
            throw new InsufficientBalanceException();
        }
        balance-=amount;
        return balance; 
     }
}
