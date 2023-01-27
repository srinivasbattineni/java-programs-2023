package com.java.ColletionPrograms;

import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l= new LinkedList<String>();
		l.add("10");
		l.add(null);
		l.add("Srini");
		System.out.println("LinkedList====="+l);
		l.add(0,"Battineni");
		System.out.println("LinkedList====="+l);
		l.set(1, "Anusha");
		System.out.println("LinkedList====="+l);
		l.addFirst("Sadineni");
		System.out.println("LinkedList====="+l);
		l.removeLast();
		System.out.println("LinkedList====="+l);
		l.clone();
		System.out.println("LinkedList====="+l);
		l.remove(1);
		System.out.println("LinkedList====="+l);
		l.clear();
		System.out.println("LinkedList====="+l);
	}

}
