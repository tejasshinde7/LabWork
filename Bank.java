package Labquetions;
/*Create a Bank class and declare an instance variable named amount of type double.
Create parameterized constructor to initialize variable “amount” with value 10000.
Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).
Calculate withdrawal based on some condition like If amount is sufficient 
then “withdraw successful” message will be printed on the console 
and amount should be updated after withdraw.Later on, 
deposit 5000 in the account balance.At the end display total balance on the console. */
public class Bank {
double amount;
// Parameterized constructor to initialize the amount
public Bank(double amount) {
	super();
	this.amount = amount;
	System.out.println("The Amount present is Account ="+amount);

}

// Method to withdraw from the account
void withdraw(double withdrawalAmount) {
	System.out.println(".....Withdraw.....");
		if(withdrawalAmount>0&&withdrawalAmount<=amount) {
		//if the condition in if block is true then it is printed below statement..
		System.out.println("Withdrawl successfull...");
	}
	else
	{
		//if the condition in if block is not true then it is printed below statement.
		System.out.println("Insufficient fund");
	}
		amount=amount-withdrawalAmount;//Amount after withdrawal
		System.out.println("Amount after withdrawal = "+amount);
	
}
//Method to deposit into the account
void deposit(double depositAmount) {
	System.out.println(".....Deposit.....");
	amount=amount+depositAmount;//Amount after deposite 5000
System.out.println("Amount after 5000 deposited");
	System.out.println("Total Balance ="+amount);
}
public static void main(String[] args) {
 // Creating an instance of the Bank class with an initial balance of 10000
	Bank obj=new Bank(10000);
	 // Withdraw 7000 from the account
	obj.withdraw(7000);
	 // Deposit 5000 into the account
	obj.deposit(5000);
}
}
