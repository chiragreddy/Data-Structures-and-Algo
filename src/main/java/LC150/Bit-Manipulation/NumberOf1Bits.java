package Easy.Arrays;

import java.util.Arrays;

// LC-191 - https://leetcode.com/problems/number-of-1-bits/ 

public class NumberOf1Bits {

	// you need to treat n as an unsigned value
	// Java has no unsigned integer types. 
	//	It has only signted integer types where if input is of length 32, first bit(MSB) represents sign - '1' represents negative ad '0' represents positive and
	//	the remaining 31 bits represent value
	
    public int hammingWeight(int n) {
      
//    	return Integer.bitCount(n); // return no of 1 bits in binary representation of integer n.
    	
    	 int result = 0;
         while(n!=0){
             n = n&(n-1);
             // n-1 gives the binary value where the least significant 1 bit becomes from 1 to 0 and the digits after that will be changed from 0 to 1
         //so the value n&n-1 is the same binary value as n where the least significant 1 bit becomes 0 and other bits are same.
         // we keep doing this until we change all 1 bits in n become zero and we count 1 bits
             result+=1;
         }
         return result;
        
    }
	
}