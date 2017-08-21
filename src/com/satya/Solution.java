package com.satya;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
         HashSet<Character> h1 = new HashSet<Character>(), h2 = new HashSet<Character>();
      for(int i = 0; i <first.length(); i++)                                            
       {
       h1.add(first.charAt(i));
       }
        
 System.out.println("h1...."+h1);       
      for(int i = 0; i < second.length(); i++)
       {
      h2.add(second.charAt(i));
       }
      System.out.println("h2...."+h2);  
     h1.retainAll(h2);
     System.out.println("h1.after..."+h1);  
    Character[] res = h1.toArray(new Character[0]);
     int length=res.length;
     int s1Delete=first.length()-length;
     int s2Delete=second.length()-length;
        int totalDeletion=s1Delete+s2Delete;
     
            return totalDeletion;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
