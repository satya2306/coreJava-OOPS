package com.satya.interview.prepare;

public class DustinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {5,2,7,2,4,7,8,2,3};
		DustinctElement.getDistinctElement(nums);


	}
	
	
	public static void getDistinctElement(int[] arr){
		for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                System.out.print(arr[i]+" ");
            }
        }

			
		}
		
		
	}


