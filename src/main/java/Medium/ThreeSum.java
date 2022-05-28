package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
	// Two pointers
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // nums[i] + nums[j] + nums[k] = 0      
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){ // i - pivot
            if (i == 0 || nums[i - 1] != nums[i]) { // check if there are duplicates - nums[i-1]! = nums[i]
                twoSumII(nums, i, res); // keep calling ths function 
            }
        }
    
        return res;
    }
    
    void twoSumII(int[] nums, int i, List<List<Integer>> res) { // two sum version where  
        int lo = i + 1, hi = nums.length - 1;
        // nums[lo] + nums[hi] = -nums[i]  
        // nums [i] = target - nums[i]
        while (lo < hi) {
            int sum = nums[i] + nums[lo] + nums[hi];
            if (sum < 0) { 
                lo++;
            } else if (sum > 0) {
                hi--;
            } else {
                res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                lo++; // since we added lo and hi, move the pointers closer
                hi--;
                while (lo < hi && nums[lo] == nums[lo - 1]){ // to avoid duplicate values again
                    lo++;
                }
            }
        }
    }
}