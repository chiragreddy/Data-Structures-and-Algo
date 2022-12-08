package LC150.Math;

import java.util.Arrays;
import java.util.Set;

// LC-202 - https://leetcode.com/problems/happy-number/
// contains in HashSet takes O(1) time compared to O(n) time in List
// T.C. - O(logn), S.C. - O(logn)

public class HappyNumber {
	
//	Set<Integer> set = new HashSet<>();
//	
//    public boolean isHappy(int num){
//      
//    	while(!set.contains(num)) {
//    	
//    		set.add(num);                // add if set doesnt contain the num
//    		num = getNum(num);
//    		
//    		if(n==1)
//    			return true;
//    		
//    	}
//    	
//    	return false;
//		
//    }
    
    public int getNext(int n) { // logn(base 10) - no of digits in a number eg - log999 = 3 (3 digits) 
    	
	    int sum = 0;
	    int remainder = 0;
	    while(n!=0) {
		    remainder = n%2;
		    sum = sum + remainder*remainder;
		    n = n/2;
	    }
	    return sum;
    
    }
    
	/*
	 * Floyds Cycle Algorithm - Linked List Approach the runtime complexity is
	 * linear (O(n)). In detecting the cycle, depending on where the cycle occurs,
	 * the fast and slow pointers may not meet on the first iteration through the
	 * linked list. But it will catch it after a certain constant number of cycles,
	 * if we call it k cycles. Then the T.C. would be k * O(n)
	 */ 
    
    // T.C. - O(klogn) with k cycles for both runners to meet in the cycle and logn(base 10) to get each digit in the number n, S.C. - O(1)
    public boolean isHappy(int n) {
       
    	 int slowRunner = n;
         int fastRunner = getNext(n);
         
         while (fastRunner != 1 && slowRunner != fastRunner) {
        	 
             slowRunner = getNext(slowRunner);          // getting next number is similar to slow pointer advancing 2 step
             fastRunner = getNext(getNext(fastRunner));
             
         }
         
         return fastRunner == 1;
    	
    }
	
}