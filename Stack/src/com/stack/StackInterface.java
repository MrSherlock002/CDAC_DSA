package com.stack;

public interface StackInterface<T> {
	public void push(T a);
	public T pop();
	public boolean isFull();
	public boolean isEmpty();
}
