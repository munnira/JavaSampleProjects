package com.munni.flextonTest;
public class ReverseString{

public String reverseWithoutBuiltIn(String string){
int len;
StringBuilder sb= new StringBuilder();
for(len=string.length()-1;len>=0;len--){
sb.append(string.charAt(len));
}
return sb.toString();
} 

public String reverseWithBuiltIn(String string){

StringBuilder sb= new StringBuilder("munnira");
return sb.reverse().toString();
}

public static void main(String[] s){
String s1 = new String("munnira");
ReverseString rev= new ReverseString();
System.out.println("Reverse of String is  : "+rev.reverseWithoutBuiltIn(s1));
System.out.println("Reverse of String is  : "+rev.reverseWithBuiltIn(s1));
}
}