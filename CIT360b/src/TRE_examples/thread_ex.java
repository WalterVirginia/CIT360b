package TRE_examples;
import java.util.*;


public class thread_ex {

	public static void main(String[] args) {
		/**
		 * This block of code creates the first thread and 
		 * prints notice that the thread has begun. 
		 */
		System.out.println("Thread has begun.");
		
		new firstExample();
		Thread t1 = new firstExample();
		
		System.out.println("Thread is over.");

	}

}

class firstExample extends Thread {
	
	public void run() {
	
	/**
	 * This method creates a loop that prints the alphabet
	 */
	char abc;
	
	for (abc = 'a'; abc <= 'z'; abc++) {
		System.out.println(abc);
	}
}
	
	/**
	 * This will start the thread
	 */
	public firstExample() {
		this.start();
	}
}
