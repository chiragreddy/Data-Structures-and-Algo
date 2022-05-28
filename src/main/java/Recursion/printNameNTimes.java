package Recursion;

public class printNameNTimes {

	static int count = 1;
	
	public static void printName(int N) {
		
		if(count > N)
			return;
		System.out.println("Test");
		count++;
		printName(N);
		
	}
	
	public static void printNameChangeParameterInMethod(int i, int N) {
		
		if(i > N)
			return;
		System.out.println("Test");
		printNameChangeParameterInMethod(i+1, N);
		
	}
	
	public static void main(String[] args) {
		
//		printName(5);
		int i = 1;
		printNameChangeParameterInMethod(i,5);
		
	}
	
}
