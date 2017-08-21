package com.satya;

public class OverloadedMethod {
	
	//most specific will be called
	   /* public void test(String str) {
		  System.out.println("String");//thats why this overload metod will be called as String is more specific and last in hierarchy
		 }
		  
		 public void test(Object obj) {
		  System.out.println("Object");
		 }*/
	
	
		 public void test(Integer str) {
			  System.out.println("integer");//thats why this overload metod will be called as String is more specific and last in hierarchy
			 }
			  
			 public void test(Float obj) {
			  System.out.println("Object");
			 }	 
		 
	
	// compile time error  as ambiguity problem
	  /*   public void test(String str) {
		  System.out.println("String");
		 }
		  
		 public void test(StringBuffer obj) {
		  System.out.println("Object");
		 }
		  */
		  
		 public static void main(String[] args) {
		  OverloadedMethod obj = new OverloadedMethod();
		 // obj.test(null);
		 }
	
	
	
	

}