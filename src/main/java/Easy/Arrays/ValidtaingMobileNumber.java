package Easy.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidtaingMobileNumber {

	
	public static void main(String[] args) {
		
		String number = "788635933";
		validate(number);
		char[] arr = new char[]{'1','2','3','4','5'};
		System.out.println(intArrayToString(arr));
		
	}
	
	public static void validate(String number) {
		
		
		if((number.startsWith("7") || number.startsWith("8") || number.startsWith("9")) && number.length()==10)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		System.out.println("SUT".contains("T"));
		Set<String> set = new HashSet<String>();
		
	}
	
	public static String intArrayToString(char[] arr) {
		
		return String.valueOf(arr);
		
		
	}
	
}
