package Labquetions;
//WAP to check Whether the number is Armstrong number or not using class and object concept
import java.util.Scanner;

public class ArmstrongNumbers {
	//main method
	public static void main(String args[]){
		int n,rem,arm=0;
		Scanner sc=new Scanner(System.in);//to get a input from a user
		System.out.println("Enter the number =");
		n=sc.nextInt();
		int temp=n;//to store a number 
		while(n>0)
		{
		rem=n%10;//checks for remainder
		arm=arm+(rem*rem*rem);
		n=n/10;
		}
		if(temp==arm)
		{
        //condition in if block is true then it will print this statement..
		System.out.println(temp +" is armstrong number");

		}
		else
		{
			//condition in if block is not true then it will print this statement..
		System.out.println(temp+" is not armstrong number");

		}
		}

		}
	

