package Labquetions;
/*Q.2)WAP to implement abstract methods for class person(id,name,salary) and subclass manager and Employee .(add your own attributes of choice)
*/
public abstract class Person1 {
	//variables
private int id;
private String name;
private double salary;
//to string method to print the output
@Override
public String toString() {
	return "Person1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
//constructor
public Person1(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

}
