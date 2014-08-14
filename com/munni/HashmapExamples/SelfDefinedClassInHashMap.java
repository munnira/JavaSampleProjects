package com.munni.HashmapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Employee extends HashMap<Integer,Employee>{
	String address;
	String empName;

	Employee(String c, String s) {
		this.address = c;
		this.empName = s;
	}
	
	public Employee put(Integer empID,Employee emp){
		
		if(containsKey(empID)){
			try {
				throw new Exception("Key already present");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
			return super.put(empID,emp);
	}

	@Override
	public String toString() {
		return address + " and " + " emp name is: " + empName;
	}

	@Override
	public boolean equals(Object o) {
		return (((Employee) o).address.equals(this.address))
				&& (((Employee) o).empName.equals(this.empName));
	}

	@Override
	public int hashCode() {
		return this.address.length() + this.empName.length();
	}
}

public class SelfDefinedClassInHashMap {
	public static void main(String[] args) {
		Map<Integer, Employee> hashMap = new HashMap<Integer, Employee>();
		Employee d1 = new Employee("23-7-235,mahatmagandhinagar,nellore",
				"sadiq");
		Employee d2 = new Employee("indiran gandhi nagar,new new bus stand",
				"munnira");
		Employee d3 = new Employee("rajmandri,india", "madhuri");
		Employee d4 = new Employee("chennai,india", "chinni");
		Employee d5 = new Employee("tamil,india", "chinni");
		Employee d6 = new Employee("chennai,tm,india", "peshu");

		hashMap.put(10, d1);
		hashMap.put(15, d2);
		hashMap.put(20, d3);
		hashMap.put(16, d4);// key is unique, though d4 and d5 content(i.e hmap
							// value is duplicate);
		hashMap.put(17, d5);// key is unique, though d4 and d5 content(i.e hmap
							// value is duplicate);

		// print size
		System.out.println(hashMap.size());

		hashMap.put(17, d6);// here we duplicated the key ,so last entry will
							// overriden with previous,to avoid such things we
							// can write our own method for inputting data to
							// hashmap

		System.out.println(hashMap.get(17));

		System.out.println("loop HashMap");
		for (Entry<Integer, Employee> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey().toString()
					+ " : EMP NAME AND AREA IS  " + entry.getValue());
		}
	}
}
