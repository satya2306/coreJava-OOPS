package com.satya.interview.prepare;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      int space;  
        
Scanner scnr = new Scanner(System.in);
      int lineNumber = 1;
        StringBuffer sbSpace = null;
        while(scnr.hasNextLine()){
        	
            String line = scnr.nextLine();
           //
            
          //  System.out.println("line " + lineNumber + " :" + line.length());
            if(lineNumber >1){
               char ch[]= line.toCharArray();
               String s= new String();
               String s1= new String();
               String new1 = "";
               String new2 = "";
                for(int i=0;i<ch.length;i++){
                    if(i==0 ||i%2==0){
                        s=Character.toString(ch[i]);
                        
                      
                        new1+=s;
                       
                    }
                    else{
                        s1=Character.toString(ch[i]);
                        new2+=s1;
                       
                    }
                    
                }
                System.out.println(new1+sbSpace+new2);        
            }
            else{
                space=   Integer.parseInt(line);
                 sbSpace = new StringBuffer();
            for (int i = 0; i <= space; i++) {
            sbSpace.append(" ");
          }
            }
            
            
          
            
            lineNumber++;
        }    


    }
}