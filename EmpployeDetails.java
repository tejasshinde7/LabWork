package Labquetions;
/*1)Write a program in Java to accept the name of an employee 
 * and his/her annual income. Pass the name and the annual income.
 *  Displays the name of the employee and
 *   the income tax as per the given tariff:
 *   
Annual Income                       Income Tax

Up to ₹2,50,000                 No tax  

                            
₹2,50,001 to ₹5,00,000         10% of the income exceeding ₹2,50,000

                       
₹5,00,001 to ₹10,00,000       ₹30,000 + 20% of the amount exceeding   ₹5,00,000

  
₹10,00,001 and above           ₹50,000 + 30% of the amount exceeding ₹10,00,000

*/

import java.util.Scanner;

public class EmpployeDetails {
	//Method to calculate income tax
	public  double calculateIncomeTax(String name,double income) {
		double tax=0;
		if(income<=250000) {
			// No tax
			 tax=0;
		}
		else if(income<=500000) {
			 // 10% of the income exceeding ₹2,50,000
			tax=(income-250000)*0.10;
		}  else if (income <= 1000000) {
	        // ₹30,000 + 20% of the amount exceeding ₹5,00,000
	        tax = 30000 + (income - 500000) * 0.20;
	    } else {
	        // ₹50,000 + 30% of the amount exceeding ₹10,00,000
	        tax = 50000 + (income - 1000000) * 0.30;
	    }
		
		return tax;
	}
	


public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	// Accepting employee name
	System.out.println("Enter the Employe Name =");
	String name=sc.nextLine();
	// Accepting annual income
	System.out.println("Enter the income =");
	double income=sc.nextDouble();
	EmpployeDetails obj=new EmpployeDetails();

double incomeTax=obj.calculateIncomeTax(name, income);
System.out.println("Name of  the employe ="+name);//to print  a name
System.out.println("Income tax given by "+name+" = " +incomeTax);//printing a Incometax given by employe

}
}