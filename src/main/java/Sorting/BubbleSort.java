package Sorting;

public class BubbleSort {
	
	// Space complexity - O(1)
	// Time complexity:
	//	      BestCase: O(n)
	//	      WorstCase: O(n^2)

	public static void main(String[] args) {
		
		int[] arr = new int[]{30,-1,40,25,1,100,52,27,9};
		System.out.println("Original Array: ");
		printArray(arr);
		BubbleSort(arr);
		System.out.println("\nSorted Array: ");
		printArray(arr);
		
	}
	
	public static void printArray(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void BubbleSort(int[] arr) {
		
		
		int temp = 0;
		for(int j = 0; j < arr.length; j++) {
			boolean swap = false;
			for(int i = 0; i < arr.length - 1; i++) {	
				if(arr[i] > arr[i+1]) {
					// swap arr[i], arr[i+1]
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swap = true; 
				}
			}
			if(swap == false)
				break;
			
		}
		
	}
	
}
