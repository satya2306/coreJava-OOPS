package com.satya;

public class ColorScreen extends Screen {
	/*
     * static method of same name and method signature as existed in super
     * class, this is not method overriding instead this is called
     * method hiding in Java
     */
    public static void show(){
        System.err.println("Overridden static method in Child Class in Java");
    }

//Read more: http://www.java67.com/2012/08/can-we-override-static-method-in-java.html#ixzz4gAOyKQUU

}
