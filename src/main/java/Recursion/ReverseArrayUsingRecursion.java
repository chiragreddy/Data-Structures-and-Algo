package Recursion;

public class ReverseArrayUsingRecursion {

	public static int[] reverseArray(int[] arr) {
		
		int l = 0;
		int r = arr.length - 1;
		
		return reverseArrEval(arr, l, r ); 
		
	}
	
	public static int[] reverseArrEval(int[] arr, int l, int r) {
		
		if(l >= r)
			return arr;
		arr = swap(arr, l, r); 
		return reverseArrEval(arr, l+1, r-1);
		
	}
	
	public static int[] swap(int[] arr, int l, int r) {
		
		int temp = 0;
		temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		return arr;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		arr = reverseArray(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
}
