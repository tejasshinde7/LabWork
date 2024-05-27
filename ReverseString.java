package Labquetions;
//WAP a program to reverse a given String without using reverse() method.
import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	String str;
	//to get input from a user
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string:");
	str=sc.nextLine();
	// toCharArray() method converts this string into character array.
	char chars[]=str.toCharArray();
	for(int i=chars.length-1;i>=0;i--) {
		System.out.print(chars[i]+ " ");//printing the reverse 
	}
}
}
