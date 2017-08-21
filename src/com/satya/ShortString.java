package com.satya;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 String[] s1={"satya","gulu","gudia","Test","Acc"};
  Arrays.sort(s1);
  for (int i=0;i<s1.length;i++){
	System.out.print(""+s1[i]+",");  
  }
	}

}
