package Recursion;

public class RecursionBaseCase {
	static int count = 0;
	public static void add() {
	
		if(count > 3)  // Base case
			return;
		System.out.println(count);
		count++;
		add();              // if no base case - stack overflow /segmentation fault
	
	}
	
	public static void main(String[] args) {
		
		add();
		
	}
	
}