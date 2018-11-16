package com.self.wrk;

public interface MyList<T> {

	public void remove(int index);
	public int size();
	public void add(T value);
	public T get(int index);
}
