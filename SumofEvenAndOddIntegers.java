package labquetions;

import java.util.Scanner;
// write a program to reads the set of integer and then print sum of even and odd integers..
public class SumofEvenAndOddIntegers {

	public static void main(String[] args) {
		int sumEven=0,sumOdd=0;
		// TODO Auto-generated method stub
int a[]=new int[10];
Scanner sc=new Scanner (System.in);
System.out.println("Enter the numbers ");
for (int i=0;i<10;i++) {
	a[i]=sc.nextInt();
}
for(int i=0;i<10;i++) {
	if(a[i]%2==0) {          //Check for even numbers
		sumEven=sumEven+a[i];// Sum of even numbers
	}
	else
	{
		sumOdd=sumOdd+a[i];// sum of odd numbers..
	}
}
	System.out.println("Sum of even numbers"+sumEven);
	
	System.out.println("Sum of odd numbers="+sumOdd);
}
}