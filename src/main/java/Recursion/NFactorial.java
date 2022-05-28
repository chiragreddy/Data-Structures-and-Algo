package Recursion;

public class NFactorial {

	public static int factorialN(int i, int N) {
		
//		Time coomplexity - O(n)
//		Space Complexity - O(n) - n function calls in stack space awaiting to be completed
		// Backtracking N to 1
//		if(N==1)
//			return 1;
//		return N * factorialN(N-1);
		// 1 to N
		if(i > N) {
			return 1;
		}
		return i * factorialN(i+1, N);
		
	}
	
	public static void main(String[] args) {
		
//	System.out.println(factorialN(6));
		System.out.println(factorialN(1,6));
		
	}
	
}
