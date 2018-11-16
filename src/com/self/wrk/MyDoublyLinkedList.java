package com.self.wrk;

public class MyDoublyLinkedList<T> {
	
	int size = 0;
	int index = -1;
	Node<T> start;
	Node<T> end;
	
	
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	public int size() {
		return size;
	}

	public void insertAtFirst(T value) {
		
		Node valueNode = new Node(value);
		if(start == null ) {
			start = valueNode;
			end = start;
		} else {
			start.setPrev(valueNode);// important assignment to have it structured in the required DDL
			valueNode.setNext(start);// 
			start = valueNode;// these three steps
		}
		size++;
	}
	
	public void deleteAtFirst() {
		
		if(start != null) {
			Node nextStartNode = start.getNext();
			nextStartNode.setPrev(null);
			start.setNext(null);
			start = nextStartNode;
		}
		
		size--;
	}
	
	public void insertAtLast(T value) {
		
		Node valueNode = new Node(value);
		if(end == null) {
			end = valueNode;
			start = end;
		} else {
			valueNode.setPrev(start);
			end.setNext(valueNode);
			end = valueNode;
		}
		size++;
	}
	
	public void deleteAtLast() {
		
		if(end != null) {
			Node nextLastNode = end.getPrev();
			nextLastNode.setNext(null);
			end.setPrev(null);
			end = nextLastNode;
		}
		size--;
	}

	public void display() {
		
		Node currNode = start; 
		System.out.print( currNode.getValue() +"<->" );
		while(currNode.getNext() != null) {
			System.out.print(currNode.getNext().getValue()+ "<-> " );
			currNode = currNode.getNext();
		}
		System.out.println();
	}
	
	public T get(int index) {
		
		Node currentNode = null;
		for(int i=0; i<= index; i++) {
			if(start.getNext() != null) {
				currentNode = start.getNext();
			}
		}
		
		return (T) currentNode.getValue();
	}

}
