package com.satya.interview.prepare;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharecterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="SSatyyataays";
		getduplicate(s);
		
	}
	
	
	private static void getduplicate(String str){
		
		char ch[]=str.toCharArray();
		Map<Character,Integer>dupMap=new HashMap<>();
		
		for(Character c:ch){
			
			if (dupMap.containsKey(c)) {
				dupMap.put(c, dupMap.get(c) + 1);

			} else {
				dupMap.put(c, 1);
			}
			
			
			
		}
		
		//return dupMap;
		
		 Set<Character> keys = dupMap.keySet();
	        for(Character cha:keys){

	        	if(dupMap.get(cha) > 1){
	                System.out.print(cha+"--->"+dupMap.get(cha));
	            }
	        }

		
	}

}
