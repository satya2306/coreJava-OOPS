package com.satya.sort;

public class MyBubbleSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a ={3,7,1,31,4,};
		blbsrt(a);

	}

	public static void blbsrt(int a[] ){
		
		int l=a.length;
		
		for(int i=0;i<=l;i++){
			
			for(int j=0;j<l-1;j++){
				int k=j+1;
				if(a[j]>a[k]){
					swap(j, k, a);
					
				}
			}
			
			
		}
		//
		print(a);
	}
	
	
	public static void swap(int j,int k,int a[]){
		int temp;
		temp=a[j];
		a[j]=a[k];
		a[k]=temp;
		
		
	}
	
	public static void print(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ", ");
		}
		System.out.println("\n");
	}
	
}
