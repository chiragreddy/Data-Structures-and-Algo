package Recursion;

public class SumOfNNumParametrizedRecursion {

	public static void sumN(int i, int sum) {
		
		if(i<1) {
			System.out.println(sum);
			return;
		}
		sumN(i-1, sum+i);
		
	}
	
	public static void main(String[] args) {
		
		int i = 6;
		int sum = 0;
		sumN(i,sum);
		
	}
	
	
}