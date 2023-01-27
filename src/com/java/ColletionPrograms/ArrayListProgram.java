package com.java.ColletionPrograms;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("10");
		al.add("Srini");
		al.add(0,"Battineni");
		System.out.println("ArrayList====="+al);
		al.clone();
		System.out.println("ArrayList====="+al);
		al.remove(1);
		System.out.println("ArrayList====="+al);
		al.clear();
		System.out.println("ArrayList====="+al);
	}

}
