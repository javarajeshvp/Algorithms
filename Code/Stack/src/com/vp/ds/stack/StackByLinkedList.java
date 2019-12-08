package com.vp.ds.stack;

import com.vp.ds.linkedlist.Node;

public class StackByLinkedList {

	private Node top;
	private static int size=0;

	public StackByLinkedList() {

	}

	public void push(Object data) {
		Node newNode = new Node(data);
		if (top == null) {
			top = newNode;
		} else {
			newNode.setNext(top);
			top = newNode;
			
		}
		size++;
	}

		
	public Object peek()
	{
		return top.getData();
	}
	
	public Object pop() {
		if (top == null) {
			return null;
		}
		Node tempNode = top;
		top = top.getNext();
		size--;
		return tempNode.getData();
	}

	public int size()
	{
		return size;
	}
	public void display() {
		if (top == null) {
			System.out.println("Stack is empty");
		}
		Node tempNode = top;
		while (tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getNext();
		}
	}

}
