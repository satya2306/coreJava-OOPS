package com.satya;

public class LargestNumber {

	public static void main(String[] args) {
	
		 int a[] =new int[] {23,8,34,87,86,67,4,5};
		 
		 
		 int smallest=a[0];
		 int largest=a[0];
		 for(int i=1;i<a.length;i++){
			 if(a[i]>largest){
				 largest=a[i]; 
			 }
			 else if(a[i]<smallest){
				 smallest=a[i];
			 }
		 }
		 System.out.println("Largest Number is : " + largest);
         System.out.println("Smallest Number is : " + smallest);
	}

}
