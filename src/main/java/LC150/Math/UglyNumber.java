package LC150.Math;

import java.util.Arrays;

// LC-263 - https://leetcode.com/problems/ugly-number/
// T.C. - logn(2) + logn(3) + logn(5), S.C. - O(1)

public class UglyNumber {

	public boolean isUgly(int n) {
      
		if(n<=0)        // only positive nums
			return false;
		
		while(n%2==0)   // keep dividing n by 2 until it won't be divisible - atmost logn(2) divisions
			n=n/2;
		while(n%3==0)   // atmost logn(3) divisions
			n=n/3;
		while(n%5==0)   // atmost logn(5) divisions
			n=n/5;
		
		return n==1;    // checking if n=1
		
    }
	
}