package com.munni.HashmapExamples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDeserialization {

	private static Map<String,Integer> map;

	public static void main(String[] args) {
		
		try{
			FileInputStream fis = new FileInputStream("countries.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			 map = (Map)ois.readObject();
			 ois.close();
			 fis.close();
			 
		}catch(IOException e){
			System.out.println("Exception Occured :"+e.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		for(Entry<String, Integer> entry:map.entrySet())
			System.out.println(entry.getKey()+":"+entry.getValue());

	}

}
