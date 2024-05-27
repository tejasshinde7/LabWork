package labquetions;

import java.util.Scanner;

//WAP to generate Even and Odd numbers between 1 and 100
public class EvenAndOdd {
public static void main(String[] args) {
int i;
System.out.println("Even Numbers are");
for(i=1;i<=100;i++) {
	if(i%2==0) {// check for Even numbers..
		//if the condition in if block is true then it will print all the Even numbers from 1 to 100.
		System.out.print(" "+i);// for printing even numbers..
	}
}
System.out.println("\nOdd numbers are");
   for(int j=1;j<=100;j++) {
	   //checks for Odd numbers..
	   if(j%2!=0) {
		   //if the condition in if block is true then it will print all the Odd numbers from 1 to 100.
		   System.out.print(" "+j);// for printing odd numbers..
	   }
   }
}
}