package Recursion;

public class SumOfNNumFunctionalRecursion {

	public static int sumN(int i, int N) {
		
		// Backtracking - N to 1 sum
//		if(N == 0)
//			return 0;
//		return N + sumN(0, N-1);
		
		// 1 to N sum
		if(i > N)
			return 0;
		return i + sumN(i+1, N);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(sumN(1, 6));
		
	}
	
}
