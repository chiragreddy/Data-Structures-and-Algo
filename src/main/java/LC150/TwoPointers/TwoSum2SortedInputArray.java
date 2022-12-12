package LC150.Math;

import java.util.Arrays;

// LC-167 - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
// T.C. - O(n) - input array is traversed atmost once, S.C. - O(1) (as output array will always have 2 values regardless of whether inpuut array changes)

public class TwoSum2SortedInputArray {

	public int[] twoSum(int[] numbers, int target) {
        
		// Brute force with nested for loop in O(n^2) to check all sum combinations
		
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;

        while(left < right){

            int sum = numbers[left] + numbers[right];
            if(sum > target) 
                right--;
            else if(sum < target)
               left++;
            else
                return new int[]{left + 1, right + 1};

        }

        return result;

    }
	
}