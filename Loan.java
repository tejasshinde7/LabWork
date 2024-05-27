package labquetions;

import java.util.Scanner;
/*WAP to check whether the person is eligible for getting loan or not.
 Condition to grant loan is he should have salary more than 50000 
 and He should be citizen of INDIA.Otherwise Loan can't be given to customer.*/

public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sal;
String citizen;
Scanner sc=new Scanner(System.in); // to get values from a user
System.out.println("Enter the salary");
sal=sc.nextInt();
sc.nextLine();
System.out.println("Enter the citizen of india");
citizen=sc.nextLine();
if(sal>50000 && citizen.equalsIgnoreCase("Indian") ) {
	//This will execute if the condition in if block is true..
	 
	System.out.println("Congrulations.... you are eligible for the loan");
	
}
else
{
	//This will print if the condition in if block is false.. 
	System.out.println("sry ..."+"you are not eligible for the loan..");
}

	}

}
