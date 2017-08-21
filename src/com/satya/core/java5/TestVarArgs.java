package com.satya.core.java5;
import static java.lang.System.*;    

public class TestVarArgs {

	public static void main(String[] args) {
		display();//zero argument   
		 display("hello");//one argument   
		 display("my","name","is","varargs");//four arguments  

	}
	static void display(String... values){  
		 // System.out.println("display method invoked ");  
		  for(String s:values){  
		   out.println(s);  
		  }  
		 }  
}
