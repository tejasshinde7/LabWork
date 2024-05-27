package Labquetions;
/* Write a program that asks the user to input ten integers and stores them in an array.

The program should then find and print the smallest and largest values in the array.
*/

import java.util.Scanner;


public class Value {

		 public static void main(String[] args) {
			// Create an array to store the integers
		  int num[] = new int[10];
		// Create a Scanner object to read user input
		  Scanner sc=new Scanner(System.in);
		  // Ask the user to input ten integers
		  System.out.println("Enter the integers =");
	        // Read the integers from the user and store them in the array
    	  for (int i = 0; i < 10; i++) {
			 num[i]=sc.nextInt(); 
		  }
		  
		  //assign first element of an array to largest and smallest
		  int smallest = num[0];
		  int largetst = num[0];

		  for (int i = 0; i <10; i++) {
		   if (num[i] > largetst)
		    largetst = num[i];
		   else if (num[i] < smallest)
		    smallest = num[i];
		  }
		// Print the smallest and largest values
		  System.out.println("Largest Number is : " + largetst);
		  System.out.println("Smallest Number is : " + smallest);
		 }
		}
	



