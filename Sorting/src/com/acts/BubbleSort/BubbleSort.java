package com.acts.BubbleSort;

class Bubble{
	public static int[] bubbleSorting(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[i]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("We are implementing the bubble sort : ");
		int[] arr ={33,42,3,14,12,53};
		
		int[] result  = Bubble.bubbleSorting(arr);
		System.out.println("\nHere is the result of bubble sort : ");
		for(int i =0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
}

