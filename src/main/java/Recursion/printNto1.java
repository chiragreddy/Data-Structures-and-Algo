package Recursion;

public class printNto1 {

	public static void printNum(int i,int N) {
		if(i<1)
			return;
		System.out.println(i);
		printNum(i-1, N);
		
	}
	
	public static void main(String[] args) {
		
		printNum(5,5);
		
	}
	
}
