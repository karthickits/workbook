package com.self.wrk.search;

public interface MySearch<T> {

	public T[] inOrder();
	public T[] preOrder();
	public T[] postOrder();
}
