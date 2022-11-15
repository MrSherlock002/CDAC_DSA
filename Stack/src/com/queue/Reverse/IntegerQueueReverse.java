package com.queue.Reverse;

public class IntegerQueueReverse {
	public static void main(String[] args) {
		System.out.println("Here is the queue reverse : ");
		
		Q myq = new Q(10);
		myq.EnQ(10);
		myq.EnQ("a");
		myq.EnQ("b");
		myq.EnQ("c");
		myq.EnQ("d");
		myq.QDisplay();
		myq.DeQ();
		myq.EnQ(100);
		
		myq.QDisplay();
		myq.QReverse();
		
		
	}

}

class Q{
	
	private int size;
	private int front,rear;
	private Object[] arr;
	
	public Q(int c){
		this.size = c;
		arr = new Object[size];
		front = -1;
		rear = -1;
	}
	
	public void EnQ(Object data) {
		if(rear==size) {
			System.out.println("Queue is full.");
		}
		else {
			arr[++rear] = data;
		}
		
	}
	
	public void DeQ() {
		if((front==-1) && (rear==-1)) {
			System.out.println("Queue is Empty.");
		}
		else {
			for(int i=0; i<rear; i++) {
				arr[i] = arr[i+1];
			}
		}
		arr[rear] = null;
		rear--;
		
	}
	public void ifFull() {
		if(front==rear) {
			System.out.println("Queue is full.");
		}
	}
	public void isEmpty() {
		if((front==-1) && (rear==-1)) {
			System.out.println("Queue is Empty.");
		}
	}	
	
	public void QDisplay() {
		System.out.println();
		for (Object a : arr) {
			System.out.print(a+" ");
		}
	}
	public void QReverse() {
		int top=0;
		Object[] rev = arr;
		Object[] x = new Object[arr.length];
		
		System.out.println();
		if((front==-1) && (rear==-1)) {
			System.out.println("Queue is Empty.");
		}
		else {
			for(int i=0; i<=rear; i++) {
				x[top] = rev[i];
				top++;
				rev[i] = rev[i+1];
			}
			for(int i=top-1; i>=0; i--) {
				System.out.print(x[i]+" ");
			}
		}
	}
}