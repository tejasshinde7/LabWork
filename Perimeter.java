package Labquetions;

import java.util.Scanner;

/*2).  Write a class with the name Perimeter using Menu driven(Switch case) that computes the perimeter of a square, a rectangle and a circle.

Formula:

Perimeter of a square = 4 * s

Perimeter of a rectangle = 2 * (l + b)

Perimeter of a circle = 2 * (22/7) * r
*/

public class Perimeter {
public static void main(String[] args) {
	int choice ;
	Scanner sc=new Scanner(System.in);
	//To accept a choice.
	System.out.println("Enter the choice ");
	choice=sc.nextInt();
	System.out.println("1.Perimeter of a square = 4 * s");
	System.out.println("2.Perimeter of a rectangle = 2 * (l + b)");
	System.out.println("3.Perimeter of a circle = 2 * (22/7) * r");
	switch(choice) {
	case 1:{
		 // Calculate perimeter of square
		//To accept a side
		System.out.println("Enter the side =");
		int s=sc.nextInt();
		System.out.println("Perimeter of a square ="+ 4 * s);
		break;
	}
	case 2:{
		 // Calculate perimeter of rectangle
		//To accept a length and breadth
		System.out.println("Enter the length and breadth ");
		int l=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Perimeter of a rectangle = "+2 * (l + b));
		break;
	}
	case 3:{
		 // Calculate perimeter of circle
		//To accept a radius
		System.out.println("Enter the radius =");
		int r=sc.nextInt();
		System.out.println("Perimeter of a circle = "+2 * (22/7) * r);
		return;
}
	default:{
		System.out.println("please enter the valid data");
	}
}
	
}
}