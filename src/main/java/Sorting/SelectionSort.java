package Sorting;

public class SelectionSort {
	
	// Space complexity - O(1)
	// Time complexity:
	//	      BestCase: O(n^2)
	//	      WorstCase: O(n^2)

	public static void main(String[] args) {
		
		int[] arr = new int[]{30,-1,40,25,1,100,52,27,9};
		System.out.println("Original Array: ");
		printArray(arr);
		SelectionSort(arr);
		System.out.println("\nSorted Array: ");
		printArray(arr);
		
	}
	
	public static void printArray(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void SelectionSort(int[] arr) {
	
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			int minIndex = i; // assuming current element index is minimum index
			int min = arr[i]; // assuming current element is minimum
			for(int j = i; j < arr.length - 1; j++) {
				if(arr[j+1] < min) {
					min = arr[j+1]; // update minimum value
					minIndex = j+1; // update minimum index value		
				}
			}
			// swap arr[minIndex] with arr[i]
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
}
