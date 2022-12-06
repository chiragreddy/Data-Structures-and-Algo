package Easy.Arrays;

import java.util.Arrays;

// LC-67 - https://leetcode.com/problems/add-binary

public class AddBinary {

	 public String addBinary(String a, String b) {
      
		 int i = a.length();
		 int j = b.length();
		 int carry = 0;
		 int sum = 0;
		 StringBuilder s = new StringBuilder();
		 
		 while(i>=0 || j>=0) {
			 
			 sum = carry;
			 
			 if(i>=0)
				 sum += Character.getNumericValue(a.charAt(i));
				 
			 if(j>=0)
				 sum += Character.getNumericValue(a.charAt(i));
			 
			 s.append(sum);                                 // 0010 + 0011 = 0101
			 carry = sum/2; // new carry (1+1 = 2/2 = 10 -> carry = 1, sum = 0)
			 
		 }
		 
		 if(carry!=0)
			 return s.append(carry).reverse().toString(); // since we are appending the bits in reverse order
		 
		 return s.reverse().toString();
       
    }
	
}