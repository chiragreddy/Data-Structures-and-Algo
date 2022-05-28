package Easy.Arrays;

import java.util.Arrays;

public class StrArray {

	public static void main(String[] args) {
		
		String[] arr = {"ZSD","BA","HGF","FFE","KIH"};
		arr = StringSort(arr);
		
		for(String s: arr) {
			System.out.println(s);
		}
		
	}
	
	public static String[] StringSort(String[] arr) {
		
		int a = arr.length;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sort(arr[i]);
		}
		
		Arrays.sort(arr);
		return arr;
		
	}
	
	public static String sort(String s) {
		
		int n = s.length();
	
		char[] c = s.toCharArray();
		// Optimized bubble sort
		boolean swap = false;
		for(int i = 0; i < c.length; i++) {
			swap = false;
			for(int j = 0; j < c.length - 1; j++) {
				if(c[j] > c[j+1]) {
					char temp = c[j];
				    c[j] = c[j+1];
				    c[j+1] = temp;		
				    swap = true;
				}
			}
			if(swap==false)
				break;
		}
		return new String(c); // CHAR ARRAY TO STRING
		
	}
	
}
