package Labquetions;
//// Thread for printing odd numbers
public class PrintOdd extends Thread{
public void run() {
	for(int i=1;i<=100;i++) {
		// Check if the current number is Odd, if yes, print and increment number.
		if(i%2!=0) {
			System.out.print(" "+i);
		}
	}
}
public static void main(String[] args) {
	PrintOdd obj=new PrintOdd();
	// Create and start the thread.
	obj.start();
}
}
