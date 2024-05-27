package Labquetions;
//Create bean for Employee with fields(eid,ename,esalary).

public class EmployeData{
private int eid;
private String ename;
private double esalary;
//Parameterized constructor
public EmployeData(int eid, String ename, double esalary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
}
//Getter and setter methods for eid
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}

// Getter and setter methods for ename
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
// Getter and setter methods for esalary
public double getEsalary() {
	return esalary;
}
public void setEsalary(double esalary) {
	this.esalary = esalary;
}//main method
public static void main(String[] args) {
	EmployeData obj=new EmployeData(122,"Tejas",50000);
	System.out.println("Id of the employe ="+obj.getEid());//For printing Employe id.
	System.out.println("Name of the employe ="+obj.getEname());//For printing Employe name
	System.out.println("Salary of the employe ="+obj.getEsalary());//For printing Employe salary
	
}

}
