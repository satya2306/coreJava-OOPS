package com.satya;

public class MyReverse {
	public String reverseWord(String word){
        
        StringBuilder sb = new StringBuilder();
        int size = word.length();
        StackImpl stack = new StackImpl(size);
        for(int i=0;i<size;i++){
            stack.push(word.charAt(i));
        }
        while(!stack.isStackEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
     
    public static void main(String a[]){
    	MyReverse mwr = new MyReverse();
        System.out.println("Satya == "+mwr.reverseWord("satya"));
      //  System.out.println("Java == "+mwr.reverseWord("Java"));
       // System.out.println("program == "+mwr.reverseWord("program"));
    }
}