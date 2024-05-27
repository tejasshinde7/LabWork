package labquetions;

public class BankAccount {
	double amount;
	double balance=100;
   public void deposit( double amount) {
	   
	   balance=balance+amount;
	   System.out.println("amount deposited"+ amount);
	   System.out.println("new balance"+ balance);
   }
   public void withdraw(double amount) {
	   if(balance>amount) {
		  balance =balance-amount;
		   System.out.println("withdraw ="+ amount);
		   System.out.println("balance ="+balance);
	   }
	   else
	   {
		   System.out.println("insufficient balance...");
	   }
	   
   }
}
