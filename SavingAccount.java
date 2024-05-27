package labquetions;

public class SavingAccount extends BankAccount{
	@Override
public void withdraw(double amount) {
	if(balance>100) {
		System.out.println("last amount ="+ amount);
		balance=balance-amount;
		System.out.println("last balance ="+balance);
	}
	else
	{
		System.out.println("withdrawn is not allowed");
	}
}
}
