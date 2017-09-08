package com.satya.core.serialisable;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Nagesh Chauhan
 */
public class Implementation {
 public static void main(String args[]) {

  /*
   * Assigning values to Man class's instance
   */
  Man man = new Man("Male", "Fair", "Satya", "Hyderabad");

  /*
   * Serializing Man's instance
   */
  try {
   FileOutputStream fileOutputStream = new FileOutputStream(
     "satyaserialiseobj.ser");
   ObjectOutputStream objectOutputStream = new ObjectOutputStream(
     fileOutputStream);
   objectOutputStream.writeObject(man);

  } catch (FileNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException ioe) {
   // TODO Auto-generated catch block
   ioe.printStackTrace();
  }

  /*
   * Deserializing Man's instance
   */
  Man manout = null;

  try {
   FileInputStream fileInputStream = new FileInputStream(
     "satyaserialiseobj.ser");
   ObjectInputStream inputStream = new ObjectInputStream(
     fileInputStream);
   manout = (Man) inputStream.readObject();

  } catch (FileNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException ioe) {
   // TODO Auto-generated catch block
   ioe.printStackTrace();
  } catch (ClassNotFoundException cnf) {
   // TODO Auto-generated catch block
   cnf.printStackTrace();
  }

  /*
   * Printing values from deserialized Man's object
   */
  System.out.println("Printing value of Deserailized Man's instance :");
  System.out.println("Gender: " + manout.getGender());
  System.out.println("Color: " + manout.getColor());
  System.out.println("Name: " + manout.getName());
  System.out.println("Address: " + manout.getAddress());
  System.out.println("State: " + manout.getState().getState());

 }

}
