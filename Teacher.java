package Labquetions;
/*Create an interface called "Person" with a method called "speak". 
* Create two classes  called "Student" and "Teacher" that 
* implement  the Person interface and implement the "speak" method. 
* Create objects of both the Student and  Teacher classes and call their respective "speak"  methods.
*/
// Define the Teacher class implementing the Person interface
public class Teacher implements Person{
	// Implement the speak method for Teacher
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("I am a Teacher..");
	}
	public static void main(String[] args) {
		// Create an object of Student class
		Studentt st=new Studentt();
		// Call the speak method for Student
        st.speak();
     // Create an object of Teacher class
		Teacher tt=new Teacher();
		// Call the speak method for Teacher
		tt.speak();
	}

}
