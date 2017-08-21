package com.satya.core.java5;

public class AutoPromoteOverload {
	
/*	public void methodM1(int a){
	System.out.println("In int method");	
	}*/
	public void methodM1(float a){
		System.out.println("In float method");
	}
	/*public void methodM1(long a){
		System.out.println("In long method");
	}*/

	/*public void methodM1(String a){
		System.out.println("In String method");
	}
	public void methodM1(StringBuffer a){
		System.out.println("In String method");
	}*/
	public void methodM1(Object a){
		System.out.println("In Object method");
	}
	public static void main(String[] args) {
		AutoPromoteOverload a=new AutoPromoteOverload();
		a.methodM1("null");
	}

}
