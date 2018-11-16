package com.self.wrk;

/*class Node<T> {
	T value;

	Node<T> next;

	Node() {
	}

	Node(T value) {
		this.value = value;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
*/
public class MyLinkedList<T> implements MyList<T>, MyQueue<T> {

	int size = 0;
	Node<T> head;
	int index = 0;

	public MyLinkedList() {
		head = new Node<T>(null);
		size = 0;
	}

	@Override
	public void add(T value) {

		Node valueNode = new Node(value);
		Node currentNode = head;

		/*
		 * while(currentNode.getNext() != null) { currentNode = currentNode.getNext(); }
		 */

		for (int i = 0; i < index && currentNode.getNext() != null; i++) {
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(valueNode);
		size++;
		index++;
	}

	@Override
	public void remove(int index) {
		Node currentNode = head;
		if (currentNode != null) {
			if (currentNode.getNext() == null ) {

				for (int i = 0; i <= index; i++) {
					currentNode = currentNode.getNext();
				}
				
				currentNode.setNext(currentNode.getNext().getNext());
			}
		}
		
		size--;
		index--;

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public T get(int index) {

		if (index < 0) {
			return null;
		}
		Node currentNode = head;
		if (currentNode != null) {
			if (currentNode.getNext() != null) {

				for (int i = 0; i <= index; i++) {
					currentNode = currentNode.getNext();
				}
			}
		}

		return (T) currentNode.getValue();
	}

	@Override
	public T peek() {
		Node currentNode = head;
		if (currentNode != null) {
			if (currentNode.getNext() != null) {

				for (int i = 0; i < index; i++) {
					currentNode = currentNode.getNext();
				}
			}
		}

		return (T) currentNode.getValue();
	}

	@Override
	public void push(T value) {
		Node valueNode = new Node(value);
		Node currentNode = head;

		/*
		 * while(currentNode.getNext() != null) { currentNode = currentNode.getNext(); }
		 */

		for (int i = 0; i < index && currentNode.getNext() != null; i++) {
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(valueNode);
		size++;
		index++;

	}

	@Override
	public void pop() {
		Node currentNode = head;
		if (currentNode != null) {
			if (currentNode.getNext() != null) {

				for (int i = 0; i < index; i++) {
					currentNode = currentNode.getNext();
				}
				
				currentNode.setNext(currentNode.getNext());
			}
		}
		
		size--;
		index--;

	}

}
