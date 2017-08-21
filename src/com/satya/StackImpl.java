package com.satya;

import java.util.HashMap;
import java.util.Map;

public class StackImpl {
	 private int stackSize;
	 private Object[] stackArr;
	 private int top;
	Map<Character,Integer> ch=new HashMap();
	
	//constructor
public StackImpl(int size)	{
	this.stackSize=size;
	this.stackArr=new Object[stackSize];
	this.top=-1;
}
	
	
	
	
	//Push
public void push(char entry) {
	if(!isStackFull()){
		top++;
    this.stackArr[top] = entry;
	}
}
	
	
	
	//pop
	
public Object pop() {
	Object entry = 0;
	//if(!isStackEmpty()){
		//top--;
     entry  = this.stackArr[top--];
	//}
    return entry;
	
}
	
	//get peek
	
public Object peek() {
    return stackArr[top];
}	
	
	
	//empty
public boolean isStackEmpty() {
    return (top == -1);
}

public boolean isStackFull() {
    return (top == stackSize - 1);
}
	
	
}
