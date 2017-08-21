package com.satya;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Please enter the number to check prime or not...");
		int count=0;
		int number=2;
		int sum=0;
		
		while(count<1000){
			
			if(isPrime(number)){
				sum+=number;
				
				count++;
			}
			
			number++;
			
		}
		System.out.print(" "+sum);
	}
	
	
	public void checkPrime(){
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number!=0 && number!=1){
		if(isPrime(number))
		
			System.out.println("Number "+number+"  is  a prime number");
		
		else
			System.out.println("Number "+number+"  is not a prime number");
	}
		
		else
			System.out.println("Number "+number+"  is not a prime number");
	}
	
	
	public static boolean isPrime(int number){
		boolean isprime=false;
		int flag=0;
		//System.out.println(number/2);
		for(int i=2;i<=number/2;i++){
			
			if(number%i==0){
				flag=1;
				break;
			}
		}
		if(flag==0){
			isprime=true;
		}
		
		return isprime;
		
	}
}
