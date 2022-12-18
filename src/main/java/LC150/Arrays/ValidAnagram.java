package LC150.Arrays;

import java.util.Arrays;

// LC-242 - https://leetcode.com/problems/valid-anagram

public class ValiAnagram {

	 public boolean isAnagram(String s, String t) {
	        
	        // Using HashMap T.C. - O(m), O(n) S.C. - O(m), O(n) , m should be equal to n

	        // if(s.length()!=t.length())
	        //     return false;

	        // Map<Character, Integer> map1 = new HashMap<>();
	        // Map<Character, Integer> map2 = new HashMap<>();

	        // for(int i = 0; i < s.length(); i++){
	        //     map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
	        // }

	        // for(int i = 0; i < t.length(); i++){
	        //    map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
	        // }

	        // for(Character c: map1.keySet() ){
	        //     if(map1.get(c)!=map2.get(c))
	        //         return false;
	        // }

	        // return true;

	     // Frequency with array T.C. - O(n) S.C - O(1)
	        if(s.length()!=t.length())
	            return false;
	        int[] counter = new int[26];
	        for(int i = 0; i < s.length(); i++){ 
	            // character to integer e.g '1' to 1 -> c - '0'
	            // character to charcter difference in integer for count in array
	            // difference b between 'e' and 'a' 'e' - 'a'  = 5
	            // So subtracting 'a' or 97 from every character gives index in the array where we can increase(for string s) and decrease the frequency(for string t). Finally if values in all indices of counter array are 0, then its true 
	            counter[s.charAt(i) - 97]++; // as this is for lowercase, for uppercase, character - 65 gives values from 0 to 25
	            counter[t.charAt(i) - 97]--;
	        }
	        for(int i = 0; i < 26; i++){
	            if(counter[i]!=0)
	                return false;
	        }
	        
	        return true;


	    }
	
}