package com.java.StringPrograms;   
public class StringPalindrome 
{  
   public static void main(String args[])  
   {  
      String str = "madam"; // Objects of String class  
      int length = str.length(); 
      String reve = "";
     
      for ( int i = length - 1; i >= 0; i-- ) { 
          reve = reve + str.charAt(i);
                }
      System.out.println(reve);
          if(str.equals(reve)) {
        	  System.out.println("Entered string/number is a palindrome.");
          }
          else
        	  System.out.println("Entered string/number isn't a palindrome.");   
      
            
   }  
}  