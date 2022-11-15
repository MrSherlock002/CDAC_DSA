package com.acts;

import java.util.Scanner;

public class BSTTester {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	BST tObj = new BST();
	
	tObj.insertInTree(tObj.root, 25); 
	tObj.insertInTree(tObj.root, 15); 
	tObj.insertInTree(tObj.root, 12); 
	tObj.insertInTree(tObj.root, 20); 
	tObj.insertInTree(tObj.root, 18); 
	tObj.insertInTree(tObj.root, 52); 
	tObj.insertInTree(tObj.root, 70); 
//	tObj.insertInTree(tObj.root, 15); 
	tObj.insertInTree(tObj.root, 37); 
	tObj.insertInTree(tObj.root, 40); 
	tObj.insertInTree(tObj.root, 63); 
	tObj.insertInTree(tObj.root, 63); 
	System.out.println("\nInOrder Traversal : ");
	tObj.inOrder(tObj.root);
	System.out.println("\npreOrder Traversal : ");
	tObj.preOrder(tObj.root);
	System.out.println("\npostOrder Traversal : ");
	tObj.postOrder(tObj.root);
	
	int leaves_count = tObj.countLeafNodes();
	System.out.println("\n Count of leaf nodes : "+leaves_count);
	
	System.out.println("\nEnter the number : ");
	int element = sc.nextInt();
	
	int freq_cnt = tObj.freqCounter(element);
	System.out.printf("\nHere is the frequency of %d  = %d",element,freq_cnt);

	int height = tObj.heightOfTree(tObj.root);
	System.out.println("\nMax Height of tree : "+height);
	
	System.out.println("\nEnter the element : ");
	element = sc.nextInt();
	
	tObj.ElementSearch(element);
	
	
	
	
}
}
