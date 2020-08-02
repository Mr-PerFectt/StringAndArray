package com.simplilearn.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestAllQueue {

	public static void main(String[] args) {
		// Queue is a child interface of collection
		// Queue works in order of First In First Out
		// Use Queue as order list to hold element
		// Two Implementation class : PriorityQueue and ArrayDqueue
		
		Queue<String> queueOfBankUsers = new ArrayDeque<>();
		queueOfBankUsers.add("John Smith");
		queueOfBankUsers.add("Mike Smith");
		queueOfBankUsers.add("Amit Varma");
		queueOfBankUsers.add("Jai Krishna");
		
		System.out.println("Head Element :"+queueOfBankUsers.element());		
		System.out.println("Head Element :"+queueOfBankUsers.peek());
		
		
		Queue<String> queueOfBankUsers2 = new PriorityQueue<String>();
		queueOfBankUsers2.add("John Smith");
		queueOfBankUsers2.add("Mike Smith");
		queueOfBankUsers2.add("Amit Varma");
		queueOfBankUsers2.add("Jai Krishna");
		
		System.out.println("Sorted Queue in Asending Order "+queueOfBankUsers2);
		System.out.println("Head Element :"+queueOfBankUsers2.element());		
		System.out.println("Head Element :"+queueOfBankUsers2.peek());
	}

}
