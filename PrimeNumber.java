package labquetions;
//Wap to check whether the entered number is prime or not
import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	int n,count=0;
	Scanner sc=new Scanner(System.in); // To get a input from user.
	System.out.println("Enter the number =");
	n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			count++;// it count the how many times the number is divisible.
		}
	}
	// Prime number is the number which is divisible by itself and 1,for that we take this condition:(count ==2).
	if(count==2) {
		// This will print if the condition in above if block is true.
		System.out.println( n+" is a Prime number.");
	}
	else
	{
		//This will print if the condition in  if block is not true.

		System.out.println(n+" is not prime number.");
	}
}
}
