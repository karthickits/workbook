package com.self.wrk.exercise;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }
      
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
        	System.out.println(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
            	System.out.println(sep);
            }
        }
    }
    
	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
		SinglyLinkedListNode valueNode = new SinglyLinkedListNode(data);
		if (llist == null) {
			llist = valueNode;
			return llist;
		} else {
			valueNode.next = llist;
			llist = valueNode;
		}

		return llist;

	}
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

       // int llistCount = scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
           // int llistItem = scanner.nextInt();
           // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

          SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, i);
          llist.head = llist_head;
        }



        printSinglyLinkedList(llist.head, "\n", null);
       // bufferedWriter.newLine();

      //  bufferedWriter.close();

       // scanner.close();
    }
}