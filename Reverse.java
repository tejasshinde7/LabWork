package Labquetions;

import java.util.Scanner;

//WAP to Reverse a string with the help of loop.
public class Reverse {
public static void main(String[] args) {
String name;
String strReverse="";//// Create an empty string to store the reversed string
Scanner sc=new Scanner(System.in);//To get input from a user..
System.out.println("Enter the name =");
name=sc.nextLine();
//// Iterate over the characters of the original string from the end to the beginning
for(int i=name.length()-1;i>=0;i--) {
	//// Append each character to the reversed string
	strReverse=strReverse+name.charAt(i); 
	}
System.out.println(strReverse);//To printing a Reverse String

}
}