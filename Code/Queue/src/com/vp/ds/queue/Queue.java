package com.vp.ds.queue;

import com.vp.ds.linkedlist.Node;

public class Queue {
	private Node head;

	public void add(Object data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node tmpNode = head;
			while (tmpNode.getNext() != null) {
				tmpNode = tmpNode.getNext();
			}
			tmpNode.setNext(new Node(data));
		}
	}

	public Object remove() {

		Object data = head.getData();
		head = head.getNext();
		return data;
	}

	public boolean isEmpty() {
		boolean isEmpty = false;
		if (head == null) {
			isEmpty = true;
		}
		return isEmpty;
	}

	public void display() {
		Node tmpNode = head;
		while (tmpNode != null) {

			System.out.println("[" + tmpNode.getData() + "]");
			tmpNode = tmpNode.getNext();
		}
	}
}
