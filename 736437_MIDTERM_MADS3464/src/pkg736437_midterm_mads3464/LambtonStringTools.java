/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg736437_midterm_mads3464;

/**
 *
 * @author macstudent
 */
public class LambtonStringTools {
 
  
  static public String reverseString(String str)
  {
      String reverseStringVal = "";
      for(int i=str.length();i>0;i--)
      {
          reverseStringVal = reverseStringVal +str.charAt(i);
          
      }
      return reverseStringVal;
  }}
  
 

