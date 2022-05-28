package Recursion;

public class ReverseArray {

	public static int[] reverseArray(int[] arr) {
		
		int temp = 0;
		
		for(int i = 0; i < arr.length/2; i++) {
			
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
			
		}
		
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
