package Recursion;

class print1toN {
	public static void printNum(int count, int N) {
		
		if(count > N)
			return;
		
		System.out.println(count);
		printNum(count+1, N);
		
	}
	
	
	public static void main(String[] args) {
		int count = 1;
		printNum(count, 5);
		
	}
	
}
