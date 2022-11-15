package com.stack;

import java.time.LocalDate;
import java.util.Stack;

public class StackTester {
	public static void main(String[] args) {
		System.out.println("Here is the Stack Implementation :");
		
		StackClass s1 = new StackClass("1", "Prasad", "prasad123@gmail", "Prasad@123", LocalDate.parse("2022-08-05"), "4103-3104-4952", "1234567890", Degree.valueOf("CSE"), LocalDate.parse("2000-03-06"));
		StackClass s2 = new StackClass("2", "Sanket", "Sanket123@gmail", "Sanket@123", LocalDate.parse("2018-06-05"), "4233-3143-4655", "1234567890", Degree.valueOf("MECHANICAL"), LocalDate.parse("1996-11-13"));
		StackClass s3 = new StackClass("3", "Abhi", "Abhi123@gmail", "Abhi@123", LocalDate.parse("2021-05-05"), "4123-3104-6452", "1234567890", Degree.valueOf("CSE"), LocalDate.parse("1999-06-15"));
		StackClass s4 = new StackClass("4", "Aditya", "Aditya123@gmail", "Aditya@123", LocalDate.parse("2020-08-05"), "4203-3164-6543", "1234567890", Degree.valueOf("IT"), LocalDate.parse("1998-02-22"));
		StackClass s5 = new StackClass("5", "Basavraj", "Basavraj123@gmail", "Basavraj@123", LocalDate.parse("2015-08-05"), "4103-3104-4952", "1234567890", Degree.valueOf("CIVIL"), LocalDate.parse("1997-07-15"));

		
		
		Stack<StackClass> stackObj = new Stack<StackClass>();
		stackObj.push(s1);
		stackObj.push(s2);
		stackObj.push(s3);
		stackObj.push(s4);
		stackObj.push(s5);
		
		System.out.println("After adding the elements into stack.");
		for (StackClass i : stackObj) {
			System.out.println(i.toString());
		}
		
		System.out.println("After pop() : ");
		stackObj.pop();
		System.out.println("Result of isEmpty() : "+stackObj.isEmpty());
		System.out.println("Result of peek() : "+stackObj.peek());	
	}
}
