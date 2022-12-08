package LC150.Bit-Manipulation;

import java.util.Arrays;

// LC-338 - https://leetcode.com/problems/counting-bits/ 

public class CountingBits {

	public int[] countBits(int n) {
      
		int[] result = new int[n+1];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = numberOf1Bits(n);
		}
				
		return result;
        
    }
	
	/* Functional Recursion
	 * 
	 * public int numberOf1Bits(int n) {
	 *  if(n==0) 
	 *  	return 0; 
	 *  if(n%2==0) 
	 *  	return numberOf1Bits(n/2); 
	 *  return numberOf1Bits(n/2) + 1; 
	 * }
	 */
	
	/* Parametric Recuursion
	 * 
	 *  public int numberOf1Bits(int i, int count){
	 * 
	 *  if(i == 0){ // return count; // }
	 * 
	 *  if(i%2==0) // return numberOf1Bits(i/2, count); // return
	 * numberOf1Bits(i/2, count+1);
	 * 
	 * }
	 */

	public int numberOf1Bits(int n){
  
	     int noOfBits = 0;
	     while(n!=0){
	         n = n&(n-1); // makes LSB of the number in binary value to 0. Continue until all characters are 0's
	         noOfBits+=1;
	     }
	     return noOfBits;
  
	}
	
}