package LC150.Bit-Manipulation;

import java.util.Arrays;

// LC-136 - https://leetcode.com/problems/single-number

public class SingleNuumber {

	public int singleNumber(int[] nums) {
      
		/* T.C. - O(n), S.C. - O(n)
		 * Using HashMap
		 * 
		 * Map<Integer, Integer> map = new HashMap<>(); 
		 * int num = 0;
		 * 
		 * for(int i = 0; i < nums.length; i++){ 
		 * 		map.put(nums[i], map.getOrDefault(nums[i],0) + 1); 
		 * }
		 * 
		 * for(Integer i : map.keySet()){
		 *  	if(map.get(i)==1){
		 *  		 num = i; break; 
		 *  	} 
		 * }
		 * 
		 * return num;
		 */
		
		// Using XOR to deal with duuplicates
		// T.C. - O(n), S.C. - O(1)
		int num = 0;

		for(int i = 0; i < nums.length; i++){
		    num = num ^ nums[i];
		}

		return num;
		
    }
	
}