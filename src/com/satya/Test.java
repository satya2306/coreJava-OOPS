package com.satya;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test {
	
	public  Test(){
		super();
		System.out.println("here");
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Integer a=null;
		//int b =6;
	//	System.out.println(a+b);
		
		//String s="test";
		//String s1=new String("test");
		//System.out.println(s==s1);
		//System.out.println(s.equals(s1));
		Test test=new Test();
		
		test.add(1d);
		
		
		LinkedHashSet<String> uniqueStrings = new LinkedHashSet<String>();

		uniqueStrings.add("B");
		uniqueStrings.add("B");
		uniqueStrings.add("A");
		uniqueStrings.add("A");
		uniqueStrings.add("C");

		List<String> asList = new ArrayList<String>(uniqueStrings);
		System.out.println(asList);
		
	}
	
	public  void add(String s){
		System.out.println("in string");
		
	}
	public  void add(double s){
		System.out.println("in int");
		
	}
}
