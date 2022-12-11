package LC150.Arrays;

import java.util.Arrays;

// LC-217 - https://leetcode.com/problems/contains-duplicate

public class ContainsDuplicate {

public boolean containsDuplicate(int[] nums) {
        
// 		   Approach - 1	
//         T.C. - O(n^2), S.C - O(1) - Nested for loop
//         for(int i = 0; i < nums.length; i++){
//             for(int j = i+1; j < nums.length; j++){
//
//                 if(nums[i] == nums[j])
//                     return true;
//
//             }
//         }
//
//         return false;

//		   Approach - 2	
//         T.C. - O(n), S.C - O(n) - HashMap                Also put and get in HashMap - O(1)
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i < nums.length; i++){
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }
//
//         for(Integer i: map.keySet()){
//             if(map.get(i) > 1)
//                 return true;
//         }
//
//         return false;

//		   Approach - 3		
//         T.C. - O(nlogn), S.C - O(1) - Nested for loop
//         Arrays.sort(nums);
//
//         for(int i = 1; i < nums.length; i++){
//
//             if(nums[i] == nums[i-1])
//                 return true;
//
//         }
//
//         return false;

//	    Approach - 4		
//      T.C. - O(n), S.C - O(n) - Nested for loop	
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){

            if(!set.contains(nums[i]))    // contains in set is O(1) taking n times
                set.add(nums[i]);
            else
                return true;

        }

        return false;

    }
	
}