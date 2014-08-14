package com.munni.HashmapExamples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class HashMapSerialization {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		hmap.put("Australia", 1);
		hmap.put("canada", 1);
		hmap.put("india", 3);
		hmap.put("usa", 4);
		
		try{
			FileOutputStream fos =new FileOutputStream("countries.ser");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(hmap);
			oos.close();
			fos.close();
			
		}catch(IOException e){
			System.out.println("IOException occured "+e.getMessage());
		}
		

	}

}
