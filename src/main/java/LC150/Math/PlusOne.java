package LC150.Math;

import java.util.Arrays;

// LC-66 - https://leetcode.com/problems/plus-one/
// T.C. - O(n), S.C. - O(n)

public class PlusOne {

	int i = digits.length -1;
	
	public int[] plusOne(int[] digits) {
      
		while(i>=0) {
			
			if(digits[i] < 9) {
				digits[i]+=1;
				return digits;
			}
			
			else {
				digits[i] = 0             // if digits is > 9, make it 0 and 1 will be carried forward
			}
			i--;
			
		}
		
		// if array has all 9's
		
		int [] result = new int[digits.length+1];
		result[0] = 1; // all digits are 0 by default, so make msb to 1
		return result;
		
    }
	
}