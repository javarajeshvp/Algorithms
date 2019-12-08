package com.vp.ds.linkedlist;

public class LinkedList {

	private Node head = null;

	private static int counter = 0;

	public void add(Object data) {
		
		if (head == null) {
			head = new Node(data);
		}
		Node currentNode = head;

		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}

		currentNode.setNext(new Node(data));
		incrementCounter();
	}

	// inserts the specified element at the specified position in this list
	public void add(Object data, int index) {
		Node tmpNode = new Node(data);
		Node currentNode = head;

		// Let's check for NPE before iterate over crunchifyCurrent
		if (currentNode != null) {
			// crawl to the requested index or the last element in the list,
			// whichever comes first
			for (int i = 0; i <= index && currentNode.getNext() != null; i++) {
				currentNode = currentNode.getNext();
			}
		}

		// set the new node's next-node reference to this node's next-node
		// reference
		tmpNode.setNext(currentNode.getNext());

		// now set this node's next-node reference to the new node
		currentNode.setNext(tmpNode);

		// increment the number of elements variable
		incrementCounter();
	}

	public Object get(int index) {
		Node currentNode = head;

		if (index >= size()) {
			return null;
		}

		for (int i = 0; i <= index; i++) {
			currentNode = currentNode.getNext();

		}

		return currentNode.getData();

	}

	public boolean remove(int index) {
		boolean isRemoved = false;
		Node currentNode = head;

		if (index >= size()) {
			return isRemoved;
		}
		for (int i = 0; i <= index; i++) {
			currentNode = currentNode.getNext();
		}

		currentNode.setNext(currentNode.getNext().getNext());
		decrementCounter();
		return true;
	}

	public void removeLast() {
		Node currentNode = head;

		for (int i = 0; i < size(); i++) {
			currentNode = currentNode.getNext();
		}

		currentNode.setNext(null);
		decrementCounter();
	}

	public void removeFirst() {
		// currentNode = head;

		head.setNext(head.getNext().getNext());
		decrementCounter();

	}

	private void incrementCounter() {
		counter++;
	}

	private void decrementCounter() {
		counter--;
	}

	public int size() {
		return counter;
	}

	public String toString() {
		Node currentNode = head.getNext();
		StringBuilder returnString = new StringBuilder();
		while (currentNode != null) {
			returnString.append("[").append(currentNode.getData()).append("]");
			currentNode = currentNode.getNext();

		}

		return returnString.toString();
	}

}
