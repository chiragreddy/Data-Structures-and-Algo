package Recursion;

public class NumberOfStepsForNumToReachZero {

	public static int numberOfSteps(int num) {
        
		int steps = 0;
		
		while(num!=0) {
			
			if(num%2==0) {
				steps+=1;
				num = num/2;
			}
			else {
				steps+=1;
				num -= 1;
			}		
			
		}
		return steps;
		
	}
	
	public static int numSteps(int num) {
		
		int steps = 0;
		return evaluateNum(steps, num);
		
	}
	// Recursion
	public static int evaluateNum(int steps, int num) {
		
		if(num==0)
			return steps;
		else if(num%2==0) {
			return evaluateNum(steps+1, num/2);
		}
		return evaluateNum(steps+1, num-1);
		
	}
	
	
	public static void main(String[] args) {
		
		int num = 123;
		//System.out.println("Number of steps: " + numberOfSteps(num));
		System.out.println("Number of steps: " + numSteps(num));
		
	}
	
}
