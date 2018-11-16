package com.self.wrk;

public interface MyQueue<T> {

	public T peek();
	public void push(T value);
	public void pop();
}
