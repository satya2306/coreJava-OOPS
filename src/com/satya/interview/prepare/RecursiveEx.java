package com.satya.interview.prepare;

public class RecursiveEx {
	static String reverse = "";

	public static void main(String[] args) {
		System.out.println(reverseString("satya"));
		String out = "";
		//System.out.println(reverse("satya", 1, out));
		//reverse2("satyab");
		
	}
	
	private static long factorial(int n)
	{
	    if (n == 1)
	        return 1;
	    else
	        return n * factorial(n-1);
	}

	

    
    public static  String reverseString(String str){
         
        if(str.length() == 1){
            return str;
        } else {
        	 System.out.println(		str.substring(0,str.length()-1));
            reverse += str.charAt(str.length()-1)
           
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
   
    }
    
    public static String reverse(String org,int index,String out){
		
    	if(org.length()<index){
    		return out;
    	}
    	else{
    		out+=org.charAt(org.length()-index)+reverse(org, index+1, out);
    		return out;
    		
    	}
    	
    	
    	//return out;

}
    
   public static void reverse2(String input){
	   char[] temparray= input.toCharArray();
	    int left,right=0;
	    right=temparray.length-1;
	    for (left=0; left < right ; left++ ,right--)
	    {
	     // Swap values of left and right 
	     char temp = temparray[left];
	     temparray[left] = temparray[right];
	     temparray[right]=temp;
	    }
	    for (char c : temparray)
	     System.out.print(c);
	    System.out.println();
	   }   

    }
