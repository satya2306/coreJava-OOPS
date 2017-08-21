package com.satya;

public class Hacker14 {
	
	int maximumDifference;
	int [] elements= {1,2,5};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hacker14().computeDifference();
	}
	public void computeDifference(){
	    if(elements.length>0)
	    {
	        maximumDifference=0;
	        int actualDifference=0;
	        for(int i=0;i<elements.length-2;i++){
	            
	            for( int j=i+1;j<=elements.length-1;j++){
	                
	              actualDifference= elements[i] -elements[j];
	                  
	              if(actualDifference<0){
	                  actualDifference=Math.abs(actualDifference);
	              }
	                
	              if(actualDifference>maximumDifference)
	                  maximumDifference=actualDifference;
	                
	            }
	            
	        }
	    }
	 System.out.println(maximumDifference);
	}
}
