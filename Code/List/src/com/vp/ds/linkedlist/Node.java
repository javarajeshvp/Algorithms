package com.vp.ds.linkedlist;

public class Node {
	
	private Node next = null;
	private Object data=null;

	public Node(Object data)
	{
		this.data = data;
	}
	public Node getNext()
	{
		return next;
	}
	public Object getData()
	{
		return data;
	}
	public void setNext(Node next)
	{
		this.next = next;
	}
	public void setData(Object data)
	{
		this.data=data;
	}
}
