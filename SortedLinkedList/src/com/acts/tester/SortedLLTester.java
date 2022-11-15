package com.acts.tester;

import com.acts.SortedLL;

public class SortedLLTester {
	public static void main(String[] args) {
		SortedLL obj = new SortedLL();
		obj.Add(10);
		obj.Add(33);
		obj.Add(23);
		obj.Add(5);
		obj.Add(-5);
	
		obj.print();
		System.out.println("\nDelete element");
		
		obj.remove(23);
		obj.print();	
		System.out.println("\nReverse of Linked list");
		obj.reverse();
		obj.print();
		obj.remove(10);
		System.out.println();
		obj.print();
	}
}
