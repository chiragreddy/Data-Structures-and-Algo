package Recursion;

public class print1toNBacktrack {

	public static void print1toNBacktrack(int N) {
		
		if(N < 1)
			return; 
		print1toNBacktrack(N-1);
		System.out.println(N);
		
	}
	
	public static void main(String[] args) {
		
		print1toNBacktrack(5);
		
	}
	
}
