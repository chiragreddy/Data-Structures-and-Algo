package Recursion;

public class ReverseArrayUsingRecursion2 {

	// one variable i instead of left and right pointer
	public static void reverseArray(int[] arr) {
		
		int i = 0;
		reverseArrEval(arr, i); 
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		
	}
	
	public static void reverseArrEval(int[] arr, int i) {
		
		if(i >= arr.length/2) // end condition is till i < arr.length/2
			return;
		arr = swap(arr, i, arr.length - 1 - i);
		reverseArrEval(arr, i+1);
		
	}
	
	public static int[] swap(int[] arr, int l, int r) {
		
		int temp = 0;
		temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		
		return arr;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
		reverseArray(arr);
		
	}
	
}
