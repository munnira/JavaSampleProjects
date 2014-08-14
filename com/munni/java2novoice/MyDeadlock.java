package com.munni.java2novoice;

public class MyDeadlock {
	 
    String str1 = "Java";
    String str2 = "UNIX";
     
    Thread trd1 = new Thread("My Thread 1"){
    	int i=0;
        public void run(){
            while(true){
                synchronized(str1){
                    synchronized(str2){
                        System.out.println(++i+" : "+str1 + str2);
                    }
                }
            }
        }
    };
     
    Thread trd2 = new Thread("My Thread 2"){
    	int j=1000;
        public void run(){
            while(true){
                synchronized(str2){
                    synchronized(str1){
                        System.out.println(--j +" : "+str2 + str1);
                    }
                }
            }
        }
    };
     
    public static void main(String a[]){
        MyDeadlock mdl = new MyDeadlock();
        mdl.trd1.start();
        mdl.trd2.start();
    }
}
