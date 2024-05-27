package Labquetions;

/*Create a class Student havisng roll_ number,Name as fields .
Create another class Marksdetails to accept 5 subject marks .
Apply Single Inheritance to display the result*/
import java.util.Scanner;

public class Marksdetails extends Student{
	int i,sum=0;
	public Marksdetails(int roll_no, String name) {
		super(roll_no, name);
		// TODO Auto-generated constructor stub
	}
	int marks[]=new int[5];//array for marks
	String subjects []=new String[5];//array for subjects
Scanner sc=new Scanner(System.in);
//method to accept a input from a user..
public void acceptMarksInfo() {
	
	System.out.println("Enter the marks");
for(int i=0;i<5;i++) {
	marks[i]=sc.nextInt();//to get a marks from a user
	}
System.out.println("Enter the subjects");
sc.nextLine();
for(int i=0;i<5;i++) {
	subjects[i]=sc.nextLine();//to get a subjects name from a user
}
}
//method to print a result
public void displayMarksInfo() {
for(int i=0;i<5;i++) {
	System.out.println(subjects[i]+" : "+marks[i]);
sum=sum+marks[i];// for um of all marks
}
System.out.println("Total marks ="+sum);
	double marksAvg=sum/5;// average of marks
	System.out.println("Average marks ="+marksAvg);
	if(marksAvg>60) {
		////condition in if block is true then it will print this statement..
		System.out.println("Result:Pass");
	}
	else
	{
		//condition in if block is not true then it will print this statement..
		System.out.println("Result:Fail");
	}
}
//main method
public static void main(String[] args) {
Marksdetails obj=new Marksdetails(5,"Shubham");
obj.acceptMarksInfo();
System.out.println("Student Details :");
System.out.println("Roll no of the student ="+obj.roll_no);
System.out.println("Name of the student ="+obj.name);
System.out.println("result :");
obj.displayMarksInfo();
//System.out.println();
}
}