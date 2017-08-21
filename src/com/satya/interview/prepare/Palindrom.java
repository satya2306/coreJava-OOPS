package com.satya.interview.prepare;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		System.out.print("Enter Number: ");
	       Scanner read = new Scanner(System.in);
int number=read.nextInt();

int n=number;


int rev=0,remnd;

while(number>0){
	remnd=number%10;
	rev=rev*10+remnd;
	number=number/10;
}

if(rev == n) 
    System.out.println(n+" is a Palindrome Number!"); 
  else 
    System.out.println(n+" is not a Palindrome Number!"); 
} 
	}


