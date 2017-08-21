package com.satya.polymerphm;

import com.satya.core.java5.Child;

public final class  ChildB extends ParentA {
	
	public int i=10;
	
	public static void main(String args[]){
		ParentA a=new ChildB();
		System.out.println("parent ref"+a.j);
		ChildB c= new ChildB();
		System.out.println("child ref"+c.i);
		
		
		ParentA a1=new ChildB();
		a1.show();
		ChildB b1= new ChildB();
		b1.show();
		a1.show1();
		b1.show1();
	}
	
public void show(){
		
		System.out.println("in child class");
		
	}
	
public static void show2(){
	
	System.out.println("in  static child class");
	
}
}
