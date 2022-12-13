package LC150.Math;

import java.util.Arrays;

// LC-125 - https://leetcode.com/problems/valid-palindrome
// T.C. - O(n), S.C. - O(n)

public class ValidPalindrome {
	
	public boolean isPalindrome(String s) {
        
		// Approach 1
        s = s.toUpperCase();
        StringBuilder s1 = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if( (c - 65) >=0 && (c-65) < 26 || (Character.getNumericValue(c) >= 0 && Character.getNumericValue(c) <=9))  // checking for alphabets and digits and using ascii value for conversion to integer e.g. A - 65 (0 to 25)
                s1.append(c);
        }
        System.out.println(s1);

        return (s1.toString()).equals(s1.reverse().toString());
        
        // Approach 2 - Two Pointers
        // T.C. - O(n), S.C. - O(1)
            
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
                
	        Character start = s.charAt(i);   // storing in Character instead of char to use isLetterOrDigit method
	        Character end = s.charAt(j);
	                
	        if (!Character.isLetterOrDigit(start)) {
	            i++;
	            continue;
	        }
	                
	        if (!Character.isLetterOrDigit(end)) {
	            j--;
	            continue;
	        }
	        
	        // if we reach this point it means both start and end are either alphabets or numbers (and we are using negative condition here)
	        if (Character.toUpperCase(start) != Character.toUpperCase(end)) {  // unlinke string where we use equals method, we can use == or != for comparision for character
	            return false;
	        }
	                
	        i++;
	        j--;    
        }
            
        return true;

    }
	
}