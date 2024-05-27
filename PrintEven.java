package Labquetions;
//Create two threads to print odd numbers and even numbers from 1 to 100?
//// Thread for printing even numbers
public class PrintEven extends Thread {
public void run() {
	for(int i=1;i<=100;i++) {
		// Check if the current number is even, if yes, print and increment number.
		if(i%2==0) {
			System.out.print(" "+i);
		}
	}
	
}
public static void main(String[] args) {
	
	PrintEven obj=new PrintEven();
	// Create and start the thread.
	obj.start();
}
}
