package Labquetions;
/*Q.1)Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat

*/
public class Employ {
	//variables with private Access modifier
private String name;
private int yearOfJoining;
private double salary;
private String address;

//getter and setter methods
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getYearOfJoining() {
	return yearOfJoining;
}
//to string method to print output.
@Override
public String toString() {
	return "Employ [name=" + name + ", yearOfJoining=" + yearOfJoining + ", address=" + address + "]";
}
public void setYearOfJoining(int yearOfJoining) {
	this.yearOfJoining = yearOfJoining;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
//constructor
public Employ(String name, int yearOfJoining, double salary, String address) {
	super();
	this.name = name;
	this.yearOfJoining = yearOfJoining;
	this.salary = salary;
	this.address = address;
}
//main method
public static void main(String[] args) {
	Employ employe1=new Employ("Robert WallsStreat", 1994, 45000,"64C-");
	Employ employe2=new Employ("Sam WallsStreat", 2000, 60000, "68D-");
	Employ employe3=new Employ("John WallsStreat",1999,35000,"26B-");
	
	System.out.println(employe1);
	System.out.println(employe2);
	System.out.println(employe3);
	
}
}
