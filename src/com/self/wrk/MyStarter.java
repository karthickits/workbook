package com.self.wrk;

public class MyStarter {

	public static void main(String arg[]) {
		MyList<Integer> myList = new MyLinkedList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		System.out.println("My list's Size " +myList.size());
		/*for(Integer val: myList) {
			System.out.println("My list's val" +val);
		}*/
		myList.remove(1);
		System.out.println("My list's Size " +myList.size());
		System.out.println("My list's element " + myList.get(0));
		
		
		MyQueue<Integer> myQueue = new MyLinkedList<>();
		myQueue.push(11);
		myQueue.push(12);
		myQueue.push(13);
		myQueue.push(14);
		myQueue.push(15);
		myQueue.push(16);
		
		MyQueue<String> myStringQueue = new MyLinkedList<>();
		myStringQueue.push("First");
		myStringQueue.push("Second");
		
		
		System.out.println("top element "+ myStringQueue.peek());
		myStringQueue.pop();
		System.out.println("top element "+ myStringQueue.peek());
		
		MyDoublyLinkedList<Integer> dll = new MyDoublyLinkedList<>();
		dll.insertAtFirst(1);
		dll.insertAtFirst(2);
		dll.insertAtLast(3);
		dll.insertAtLast(5);
		dll.insertAtFirst(4);
		
		System.out.println("List size "+ dll.size());
		dll.display();
		/*System.out.println("element at position "+ dll.get(0) + " : list size "+ dll.size());
		System.out.println("element at position "+ dll.get(1) + " : list size "+ dll.size());
		System.out.println("element at position "+ dll.get(2) + " : list size "+ dll.size());
		System.out.println("element at position "+ dll.get(3) + " : list size "+ dll.size());*/
		dll.deleteAtFirst();
		dll.display();
		System.out.println("List size "+ dll.size());
		System.out.println("elem after deleting "+dll.get(0) );
		
		
	}
}
