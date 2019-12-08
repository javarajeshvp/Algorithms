package com.vp.ds.stack;

public class StackByArray {

	public StackByArray(){
		
	}
	Integer stackSizie = 10;
	int top;
	Object array[] = new Object[stackSizie];
	
	public void push(Object data){
		if(top == stackSizie-1){
			System.out.println("Stack is full");
		}else
		{
			top=top+1;
			array[top]= data;
		}
	}
	
	public Object peek()
	{
		return array[top];
	}
	public Object pop()
	{
		Object tempVal= array[top];
		top=top-1;
		return tempVal;
	}

	public void display()
	{
		for(int i=top;i>0 ;i--){
		
			System.out.println(array[i]);
		}
	}
}
