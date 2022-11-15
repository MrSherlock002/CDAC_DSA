package com.stack;

import java.time.LocalDate;

public class StackTester1 {

	//Stack<StackClass> ex = new Stack<StackClass>();
	public static void main(String[] args) {
		System.out.println("Here is the Stack Implementation :");

		StackClass s1 = new StackClass("1", "Prasad", "prasad123@gmail", "Prasad@123", LocalDate.parse("2022-08-05"), "4103-3104-4952", "1234567890", Degree.valueOf("CSE"), LocalDate.parse("2000-03-06"));
		StackClass s2 = new StackClass("2", "Sanket", "Sanket123@gmail", "Sanket@123", LocalDate.parse("2018-06-05"), "4233-3143-4655", "1234567890", Degree.valueOf("MECHANICAL"), LocalDate.parse("1996-11-13"));
		StackClass s3 = new StackClass("3", "Abhi", "Abhi123@gmail", "Abhi@123", LocalDate.parse("2021-05-05"), "4123-3104-6452", "1234567890", Degree.valueOf("CSE"), LocalDate.parse("1999-06-15"));
		StackClass s4 = new StackClass("4", "Aditya", "Aditya123@gmail", "Aditya@123", LocalDate.parse("2020-08-05"), "4203-3164-6543", "1234567890", Degree.valueOf("IT"), LocalDate.parse("1998-02-22"));
		StackClass s5 = new StackClass("5", "Basavraj", "Basavraj123@gmail", "Basavraj@123", LocalDate.parse("2015-08-05"), "4103-3104-4952", "1234567890", Degree.valueOf("CIVIL"), LocalDate.parse("1997-07-15"));

		Stack<StackClass> s = new Stack<StackClass>(10);
		s.push(s1);
		s.printStack();
	}


	public static class Stack <T> implements StackInterface{

		//Store elements of stack
		private Object arr[];

		//represent top of stack
		private int top;

		//total capacity of the stack
		private int capacity;

		//creating a stack

		Stack(int size){
			//initialize the array
			//initialize the stack variables

			arr = new StackClass[size];
			capacity = size;
			top = -1;
		}

		//push elements to the top of stack

//		@Override
//		public void push(StackClass a) {
//
//			if(isFull()) {
//				System.out.println("Stack OverFlow.");
//
//				//terminates the program.
//				System.exit(0);
//			}
//			//insert element on top of stack
//			System.out.println("Inserting : "+a.toString());
//			arr[++top] = a;
//		}


		// pop elements from top of stack

		@Override
		public Object pop() {
			// if stack is empty
			// no element to pop
			if (isEmpty()) {
				System.out.println("STACK EMPTY");
				// terminates the program
				System.exit(1);
			}

			// pop element from top of stack
			return arr[top--];
		}

		@Override
		public boolean isFull() {


			return top == capacity - 1;
		}

		@Override
		public boolean isEmpty() {


			return top == -1;
		}

		public void printStack() {
			for (int i = 0; i <= top; i++) {
				System.out.print(arr[i] + ", ");
			}

		}

		@Override
		public void push(Object a) {
			if(isFull()) {
				System.out.println("Stack OverFlow.");

				//terminates the program.
				System.exit(0);
			}
			//insert element on top of stack
			//System.out.println("Inserting : "+a.toString());
			arr[++top] = a;
		}
	}
}