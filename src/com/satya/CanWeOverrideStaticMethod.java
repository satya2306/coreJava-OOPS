package com.satya;

public class CanWeOverrideStaticMethod {
	public static void main(String args[]) {
	      
		Screen scrn = new ColorScreen();
      
        //if we can  override static , this should call method from Child class
        scrn.show(); //IDE will show warning, static method should be called from classname
      
    }  
  
}

//Read more: http://www.java67.com/2012/08/can-we-override-static-method-in-java.html#ixzz4gAOXIpXP