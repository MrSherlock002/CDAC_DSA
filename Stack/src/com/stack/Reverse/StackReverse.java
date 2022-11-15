package com.stack.Reverse;

public class StackReverse {
	public static void main(String[] args) {

		System.out.println("Here is the reverse stack implementation : ");


		Stack stackObj = new Stack(10);
		System.out.println("Result of isEmpty() : "+stackObj.isEmpty());
		System.out.println("Result of isFull() : "+stackObj.isFull());
		stackObj.push(10);
		stackObj.push(20);
		stackObj.push(30);
		stackObj.push(40);
		System.out.println("Result of isEmpty() : "+stackObj.isEmpty());
		System.out.println("Result of isFull() : "+stackObj.isFull());
		stackObj.StackDisplay();

		stackObj.pop();
		stackObj.pop();
		stackObj.push(70);
		stackObj.push(100);
		stackObj.StackDisplay();

		stackObj.StackReverse();
		stackObj.RevStackDisplay();
	}
}

class Stack {
	int arr[];
	int capacity;
	static int top;
	int[] revStack;

	public Stack(int c) {
		capacity = c;
		arr = new int[capacity];
		top = 0;
		revStack = new int[capacity];
	}

	public void push(int data) {
		if(top==capacity-1) {
			System.out.println("Stack is full");
		}else {
			arr[top] = data;
			top++;
		}

	}

	public int pop() {
		if(top==0) {
			System.out.println("Stack is empty.");
		}
		else {
			arr[top] = 0;
			return arr[--top];

		}
		return -1;

	}

	public boolean isFull() {
		if(top==capacity-1) {
			return true;
		}
		else
			return false;
	}

	public boolean isEmpty() {
		if(top==0) {
			return true;
		}
		else {
			return false;
		}
	}
//	//int [] newArr=new int[arr.length];
	
	public void StackReverse() {
		int j = top-1;
		for(int i =0; i<top; i++) {
			revStack[i] = arr[j];
			j--;
		}
	}

	public void StackDisplay() {
		System.out.println();
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

	public void RevStackDisplay() {
		System.out.println();
		for (int i : revStack) {
			System.out.print(i+" ");
		}
	}
}
