package Sorting;

import java.util.HashMap;
import java.util.Map;

public class MergeSort {

	static int right = 0;
	static int left = 0;
	static int conquer = 0;
	public static void main(String[] args) {
		
		int[] arr = new int[] {3,25,67,4,45,2,0,-1};
		System.out.println("Original Array\n");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		int l=0, r = arr.length - 1;
		divide(arr, l, r);
		System.out.println("\nSorted Array\n");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}
	
	public static void divide(int[] arr, int l, int r) {
		
		if(l >= r)            // l<r - condition
			return;
		
		int mid = l + (r - l)/2;
	
//		System.out.println("Calling left " + ++left);
		divide(arr, l, mid);           // starting index for left sub array - l , ei - mid
//		System.out.println("Calling right " + ++right);
		divide(arr, mid +1, r);        // starting index for right subarray - mid + 1, ei - r
		conquer(arr, l, mid, r); // sending two halves to conquer
		
	}
	
	public static void conquer(int[] arr, int l, int mid, int r) { // two subarrays for every conquer call - referring to left and subarrays in original array with indexes passed
//		System.out.println("calling conquer " + ++conquer);
		int[] result = new int[r-l+1]; // length of total array - r - l + 1
		int id1 = l; // starting index of left sub array
		int id2 = mid+1; // starting index of right sub array
		int k = 0;  // starting index for result array
		while(id1 <= mid && id2 <=r) { // ending index of left sub array - mid and ending index of right subarray - r
			if(arr[id1] < arr[id2]) {
				result[k] = arr[id1];
				k++;
				id1++;
			}
			else {
				result[k] = arr[id2];
				k++;
				id2++;
			}
		}
		
		while(id1<=mid) {
			result[k] = arr[id1];
			k++;
			id1++;
		}
		
		while(id2<=r) {
			result[k] = arr[id2];
			k++;
			id2++;
		}
		
		int ind = l; // copying merged array to original array  - index starts from l for original array as it cant be 0 for every sub array
		for(int i = 0; i < result.length; i++) {
			arr[ind] = result[i];
			ind++;
		}
		// array length remains same throught the conquer/merge process, we are just copying the values of the result array we got after merging and storing only values in those indices to the original array
	}
	
}