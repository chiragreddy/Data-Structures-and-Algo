package Easy.Arrays;

import java.util.Arrays;

// LC-268 - https://leetcode.com/problems/missing-number/
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

public class NumberOf1Bits {

	public int missingNumber(int[] nums) {
    	
		int missingNumber = nums.length; // index cannot be out of bouds of array length. so, initializing missingNumber to array length
		for(int i = 0; i < nums.length; i++) {
			missingNumber = missingNumber ^ i ^ nums[i]; // xor all the values in array with the respective indices to get missing number
		}
		return missingNumber;
        
    }
	
}