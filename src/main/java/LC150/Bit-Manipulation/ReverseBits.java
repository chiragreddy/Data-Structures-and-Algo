package LC150.Bit-Manipulation;

import java.util.Arrays;

// LC-190 - https://leetcode.com/problems/reverse-bits

public class ReverseBits {

	// you need treat n as an unsigned value
    public int reverseBits(int n) {
      
       int result = 0; // (0000 - 32 bit value)
       for (int i=0; i<32; i++){
    	   result<<=1;
    	   result=result | (n&1); // 'OR' with the answer, as we already dealt with the lsb i.e. last bit of n with n&1 we move on by pushing the lsb with right shift n>>=1
           n>>=1;   // pushing the LSB bit in n as we already added to result
       } 
       return result;
       
    }
	
}