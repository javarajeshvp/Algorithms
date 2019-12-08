package com.vp.ds.stack;

public class StackTest {

public static void main(String arg[]){
	StackByLinkedList stack = new StackByLinkedList();
	stack.push(10);
	stack.push(20);
	stack.push(30);
	System.out.println("peek 30 : " + stack.peek());
	System.out.println("size 3: " + stack.size());
	stack.push(40);
	stack.push(50);
	stack.display();
	
	System.out.println("stack.pop()" + stack.pop());
	System.out.println("peek 40 : " + stack.peek());
	System.out.println("stack.pop()" + stack.pop());
	
	stack.display();
	System.out.println("\n");
	stack.push(100);
	System.out.println("size 4: " + stack.size());
	System.out.println("peek 100: " + stack.peek());
	stack.display();
	
	System.out.println("Now Array based stack");
	StackByArray stackByArray = new StackByArray();
	stackByArray.push(10);
	stackByArray.push(20);
	stackByArray.push(30);
	System.out.println("peek 30 : " + stackByArray.peek());
	stackByArray.push(40);
	stackByArray.push(50);
	stackByArray.display();
	
	System.out.println("stack.pop()" + stackByArray.pop());
	System.out.println("peek 40 : " + stackByArray.peek());
	System.out.println("stack.pop()" + stackByArray.pop());
	stackByArray.display();
	System.out.println("\n");
	stackByArray.push(100);
	System.out.println("peek 100: " + stackByArray.peek());
	stackByArray.display();
	
	
}
}
