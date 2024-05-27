package Labquetions;

public class Employe1 extends Person1 {
private String designation;
//constructor
public Employe1(int id, String name, double salary, String designation) {
	super(id, name, salary);
	this.designation = designation;
}
//main method
public static void main(String[] args) {
	Manager manager=new Manager(12,"Tejas",45000.00,"IT");
	Employe1 employe=new Employe1(15,"Shubham",10000,"Software enginnering");
	System.out.println("Manager details");
	System.out.println(manager);
	System.out.println("Employe details");
	System.out.println(employe);
}
}
