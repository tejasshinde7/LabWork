package labquetions;

import java.util.Scanner;
//WAP to generate fibonacci series 0 1 1 2 3 5 8

public class Fibonacci {
int n,a,b,sum=0; //variables.
Scanner sc=new Scanner (System.in); // To get input from a user 
public void data() { 
	System.out.println("Enter the number =");
	n=sc.nextInt();
	System.out.println("Enter the value of a=");
	a=sc.nextInt();
	System.out.println("Enter the value of b=");
	b=sc.nextInt();
	System.out.println("Fibonacci series =");
	System.out.print(a); // Printing the First number(i.e=0)
	
	System.out.print(" "+b);//Printing the Second number (i.e =1);
}

public void display() {
	
for(int i=1;i<=n;i++) { // loop starts from 1 and end on n(i.e=5); 
	int sum=a+b;  // it will add two numbers..
	 a=b;         // process of swapping is done here.
	 b=sum;

	 System.out.print(" "+sum);// it will print sum ..
}

}
public static void main(String[] args) {
	Fibonacci obj=new Fibonacci(); // object creation
	obj.data(); 
	obj.display();
}
}
