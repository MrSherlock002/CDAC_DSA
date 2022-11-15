package com.acts.selectionSort;

class Selection{
	public static int[] SelectionSorting(int[]arr) {
		int n = arr.length;
		
		for(int i = 0; i<n-1; i++) {
			int min = i;
			for(int j = i+1; j<n; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i]  ;
			arr[i] = temp;
		}
		return arr;
	}
}

public class SelectionSort {
	public static void main(String[] args) {
		System.out.println("We are implementing the Selection sort : ");
		int[] arr ={33,432,3,141,12,53};
		
		int[] result = Selection.SelectionSorting(arr);
		System.out.println("\nHere is the result of Selection sort : ");
		for(int i =0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

}
