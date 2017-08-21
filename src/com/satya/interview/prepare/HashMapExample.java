package com.satya.interview.prepare;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		getMap();

	}

	
	public  static void getMap(){
	HashMap<String, String> loans = new HashMap<String, String>();
	loans.put("home loan", "citibank");
	loans.put("personal loan", "Wells Fargo");

	for (String key : loans.keySet()) {
	   System.out.println("------------------------------------------------");
	   System.out.println("Iterating or looping map using java5 foreach loop");
	   System.out.println("key: " + key + " value: " + loans.get(key));
	   loans.remove(key);
	}
	
	Iterator<Map.Entry<String, String>> iterator = loans.entrySet().iterator();
	while(iterator.hasNext()){
		 System.out.printf("loans.size()"+loans.size());
		HashMap.Entry<String, String> entry = iterator.next();
	   System.out.printf("Key : %s and Value: %s %n", entry.getKey(), entry.getValue());
	   iterator.remove(); // right way to remove entries from Map, 
	     
	   
	   /*for (String key : loans.keySet()) {
		   System.out.println("------------------------------------------------");
		   System.out.println("Iterating or looping map using java5 foreach loop");
		   System.out.println("key: " + key + " value: " + loans.get(key));
		}*/
		// avoids ConcurrentModificationException
	}
	 System.out.printf("loans.size()"+loans.size());
	
	


	

	}
}
