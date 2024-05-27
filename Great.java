package labquetions;
// WAP to find Greatest among three number using Nested if

import java.util.Scanner;

public class Great {
int num1,num2,num3;
Scanner sc=new Scanner(System.in);//to get a numbers from a user.

public void acceptData() {
	System.out.println("Enter the numbers");
	num1=sc.nextInt();
	num2=sc.nextInt();
	num3=sc.nextInt();
	
}
public void display() {
	if(num1>num2) {
		if(num1>num3) {
	/*This will only execute  if conditions given in both the if blocks is true
	 * which means num1 is greater than num2 and num3..
	 */
			System.out.println("Greatest number is ="+num1);
		}
		else
		{
			/*This will only execute if the condition in outer if
			 * is true and condition in inner if is false. which
			 * means num1 is grater than num2 but less than num3.
			 * which means num3 is the largest
			 */
			System.out.println("Greatest number is ="+num3);
		}
		
	}
	else {
		if(num2>num3) {
			/* This will execute if the condition in outer if is false
			 * and inner if is true which means num3 is greater than num1
			 * but num2 is greater than num3. That means num2 is largest
			 */
			System.out.println("Greatest number ="+num2);
		}
		else
		{
			/* This will execute if the condition in outer if is false
			 * and inner if is false which means num3 is greater than num1
			 * and num2. That means num3 is largest
			 */
			System.out.println("Greatest nyumber ="+num3);
		}
	}
}
public static void main(String[] args) {
	Great obj=new Great();
	obj.acceptData();
	obj.display();
}
}
