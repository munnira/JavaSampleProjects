package com.munni.arraylistExamples;

import java.util.ArrayList;


class Student{
	
	String name;
	Integer age;
	
	Student(String sname,Integer sage){
		this.name=sname;
		this.age=sage;
	}
	
	@Override
	public String toString() {
		return "name = "+this.name+", age ="+this.age;
	}
	
}
public class OverridingToStringMethod {
	
	

	public static void main(String[] args) {
		System.out.println("for simple arraylist u dont need to override toString()");
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("hello");
		System.out.println(al1);
		
		System.out.println("For Reference objects(Customized) -- u need to override toString to get u/p in desired format");
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(new Student("munnira",24));
		al2.add(new Student("shaik",34));
		for(Student s:al2)
			System.out.println(s);
		

	}

}
