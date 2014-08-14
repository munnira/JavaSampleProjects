package com.munni.stringsSample;


	

public class ComputeInitials {
    public static void main(String[] args) {
        String myName = "Fred F. Flintstone";
        StringBuffer myInitials = new StringBuffer();
        int length = myName.length();

        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(myName.charAt(i))) {
                myInitials.append(myName.charAt(i));
            }
        }
        System.out.println("My initials are: " + myInitials);
        
  //valid for upper or lower
    
    String name="munnira shaik";
//    \s fr whit space,\t,\r
    String[] asplit=name.split("\\s");
    StringBuffer sb = new StringBuffer();
    for(String s:asplit){
    	sb.append(s.charAt(0));
    }
    System.out.println(sb);
    }
    
    
}


