package com.acts;

public class SortedLL implements SortedLLInterface {
	Node head,tail;
	int counter=0;
	class Node{
		int data;
		Node next;
		//Node previous;		

		Node(int data){
			this.data = data;
		}
	}

	@Override
	public void Add(int element) {
		Node newNode = new Node(element);
		newNode.data = element;
		newNode.next = null;
		Node current=head;
		Node prev;
		if(head==null) {
			head = newNode;
			tail=newNode;
			return;
		}
		current = head;
		prev = null;
		do {
			if(current.data > newNode.data) {
				//found the element.
				break;
			}
			prev = current;
			current = current.next;
		}while(current!=null);


		if(prev==null) {
			newNode.next = head;
			head = newNode;
		}
		else {
			newNode.next = prev.next;
			prev.next = newNode;
		}
	}

	@Override
	public void remove(int element) {
		Node newNode = new Node(element);
		newNode.data = element;
		Node current=head;
		Node prev=null;

		while(current!=null) {
			if(current.data== newNode.data) {
				break;
			}
			prev = current;
			current = current.next;
		}

		if(current==null) {
			System.out.println("No element to delete ");
			return;
		}

		if(current==head) {
			head = head.next;
			
			return;
		}
		prev.next = current.next;
	}
	
	@Override	
	public void reverse() {
		//this changes the total link structure.
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current!= null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;		
	}

	@Override
	public void print() {
		Node current;
		current = head;
		while(current!=null) {
			System.out.print(" "+current.data);
			current = current.next;
		}
	}
}
