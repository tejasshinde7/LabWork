package labquetions;
 class A{
	 public void methodA() {
		 System.out.println("Base class");
	 }
 }
 class B extends A{
	 public void methodB() {
		 System.out.println("child class");
	 }
 }
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   B obj=new B();
   obj.methodA();
   obj.methodB();
	}

}
