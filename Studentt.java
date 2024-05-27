package Labquetions;
/*Create an interface called "Person" with a method called "speak". 
* Create two classes  called "Student" and "Teacher" that 
* implement  the Person interface and implement the "speak" method. 
* Create objects of both the Student and  Teacher classes and call their respective "speak"  methods.
*/
//Define the Studentt class implementing the Person interface
public class Studentt implements Person{
	// Implement the speak method for Student
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("I am a Student..");
	}

}
