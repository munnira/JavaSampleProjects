package com.munni.stringsSample;



import java.util.*;
 
class ReverseString
{
   public static void main(String args[])
   {
      String original;
      StringBuilder reverse = new StringBuilder();
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to reverse");
      original = in.nextLine();
 
      int length = original.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse.append(original.charAt(i));
 
      System.out.println("Reverse of entered string is: "+reverse);
      
      //other way
      
      StringBuilder sb=new StringBuilder("munnira");
       System.out.println(sb.reverse());
      
   }
}
