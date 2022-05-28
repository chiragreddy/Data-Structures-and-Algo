package Recursion;

public class PalindromeUsingRecursion {

	// Time coomplexity - O(n/2) = O(n)
	// Space complexity - O(n/2) - n/2 recursive calls waiting in stack space = O(n) - Worst Case
	public static boolean isPalindrome(String str, int i) {
		if(i >= str.length()/2) 
			return true; // if it reaches here, it means the below if isnt executed even once
		if(str.charAt(i)!=str.charAt(str.length()-1-i)) 
			return false;
		return isPalindrome(str, i+1);
	}
	
	public static void main(String[] args) {
		String str = "aaafdfdfaba";
				
		int i = 0;
		if(isPalindrome(str, i))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
}