package com.vp.ds.linkedlist;

import com.vp.ds.mylinkedlist.MyLinkedlist;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.add("Rajesh");
		linkedList.add("Sugi");
		linkedList.add("Ritsi");
		linkedList.add("Risto");//
		//System.out.println("linkedList \n " + linkedList);
		linkedList.add("Gopal",0);
		linkedList.add("Sumit",3);
		

		//System.out.println("linkedList \n " + linkedList);
		System.out.println("linkedList.size " + linkedList.size());
		
		
		System.out.println("Element at  at 1  " + linkedList.get(1));
		System.out.println("Element at  at 3  " + linkedList.get(3));
		
		linkedList.remove(0);
		System.out.println("linkedList  " + linkedList);
		System.out.println("linkedList.size " + linkedList.size());
		System.out.println("Removing Last");
		linkedList.removeLast();
		System.out.println("linkedList  " + linkedList);
		
		/*
		linkedList.removeFirst();
		linkedList.removeFirst();
		
		System.out.println("linkedList \n " + linkedList);
		*/
		System.out.println("**********************");
		MyLinkedlist myLinkedList = new MyLinkedlist();
		myLinkedList.add("Rajesh");
		myLinkedList.add("Sugi");
		myLinkedList.add("Ritsi");
		myLinkedList.add("Risto");
		//System.out.println("myLinkedList \n " + myLinkedList);
		//myLinkedList.replace("GopalR",0);
		//myLinkedList.replace("SumitR",3);
		myLinkedList.add("Gopal",0);
		myLinkedList.add("Sumit",3);
		System.out.println("myLinkedList \n " + myLinkedList);
		System.out.println("myLinkedList.size  " + myLinkedList.size());
		
		
		System.out.println("Element at  at 1  " + myLinkedList.get(1));
		System.out.println("Element at  at 3  " + myLinkedList.get(3));

		myLinkedList.remove(0);
		System.out.println("myLinkedList  " + myLinkedList);
		System.out.println("myLinkedList.size " + myLinkedList.size());
		System.out.println("Removing Last");
		myLinkedList.removeLast();
		System.out.println("myLinkedList  " + myLinkedList);

	}

}
