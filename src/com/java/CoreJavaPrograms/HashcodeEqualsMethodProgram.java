package com.java.CoreJavaPrograms;

import java.util.HashMap;
import java.util.Map;

class Employee3{
	int id;
	public Employee3(int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
}

 public class HashcodeEqualsMethodProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee3 emp1=new Employee3(1);
		Employee3 emp2=new Employee3(1);
		
		Map<Employee3,String> map=new HashMap<Employee3,String>();
		map.put(emp1, "one");
		map.put(emp2, "one");
		
		System.out.println("map.size()======="+map.size());
		
		Integer i= new Integer(1);
		Integer i1= new Integer(1);
		
		Map<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(i, "two");
		map1.put(i1, "two");
		System.out.println("map1.size()======="+map1.size());
		

	}

}
