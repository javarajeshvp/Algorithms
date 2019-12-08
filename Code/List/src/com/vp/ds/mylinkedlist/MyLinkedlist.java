package com.vp.ds.mylinkedlist;

import com.vp.ds.linkedlist.Node;

public class MyLinkedlist {

	private Node head;
	private static int size = 0;

	public void add(Object data) {
		if (head == null) {
			head = new Node(data);
		} else {
			// add a new node to the end
			// Navigate to the end
			Node lastNode = head;
			while (lastNode.getNext() != null) {
				lastNode = lastNode.getNext();
			}
			lastNode.setNext(new Node(data));
		}
		size++;
	}

	public void add(Object data, int index) {

		Node newNode = new Node(data);
		Node currentNode = head;
		for (int i = 0; i < index && currentNode.getNext() !=null; i++) {
			currentNode = currentNode.getNext();
		}
		newNode.setNext(currentNode.getNext());
		currentNode.setNext(newNode);
		
		size++;
	}

	public Object get(int index){
		Node currentNode=head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
	}
	
	public void remove(int index){
		Node currentNode=head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		
		currentNode.setNext(currentNode.getNext().getNext());
		size--;
	}
	/*
	public void removeLast(){
		Node currentNode=head;
		while(currentNode.getNext()!=null){
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(null);
		size--;
	}
	*/
	public void removeLast() {
		Node currentNode = head;

		for (int i = 0; i < size()-2 ; i++) {
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(null);
		size--;
	}
	public void replace(Object data, int index) {

		Node currentNode = head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		currentNode.setData(data);

	}

	public int size() {
		return size;
	}

	public String toString() {
		Node tmpNode = head;
		StringBuilder str = new StringBuilder();
		while (tmpNode != null) {
			str.append(tmpNode.getData());
			str.append(",");
			tmpNode = tmpNode.getNext();
		}
		return str.toString();
	}

}
