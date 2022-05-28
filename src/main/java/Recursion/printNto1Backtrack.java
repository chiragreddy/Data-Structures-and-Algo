package Recursion;

public class printNto1Backtrack {

	public static void printNto1Backtrack(int i, int N) {
		
		if(i > N)
			return;
		
		printNto1Backtrack(i+1, N);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		printNto1Backtrack(1,5);
		
	}
	
}
