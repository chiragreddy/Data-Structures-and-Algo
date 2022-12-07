package Easy.Arrays;

import java.util.Arrays;

// LC-7 - https://leetcode.com/problems/reverse-integer/
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).Given a signed 32-bit integer x
// T.C. - O(logx) (base10) - logx(base 10) digits in x, S.C. - O(1)

public class ReverseInteger {

	public int reverse(int x) {
      
		int answer = 0;
		int remainder = 0;
		
		while(x!=0) {
			
			remainder = x%10;  // getting every digit with pop operation 
			// if answer > Integer.MAX_VALUE/10, then answer = answer*10 + rem will overflow
			if(answer > Integer.MAX_VALUE/10 || answer < Integer.MIN_VALUE/10)
				return 0;
			answer = answer*10 + remainder; // push operation
			x = x/10;  // pop operation
			
		}
		
		return answer;
		
    }
	
}