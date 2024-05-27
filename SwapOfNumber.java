package Labquetions;
//WAP to swap two numbers without using third variable using class and object concept.
import java.util.Scanner;

public class SwapOfNumber {
	//main method
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a:");
	//Input two numbers from a user.
	int a=sc.nextInt();
	System.out.println("Enter the value of b:");
	int b=sc.nextInt();
	a=a+b;
	b=a-b;//to get a value of b
	a=a-b;//to get value of a
	System.out.println("Value of a after swapping ="+a);
	System.out.println("Value of b after swapping ="+b);
}
}
