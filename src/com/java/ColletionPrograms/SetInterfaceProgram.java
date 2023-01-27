package com.java.ColletionPrograms;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*class MyComperator implements Comparator{
	public int compare(Object ob1,Object ob2){
		
		Integer i1=(Integer)ob1;		
		Integer i2=(Integer)ob2;
		if(i1<i2)
			return +1;
		else if (i1>i2)
		
		return -100;	
		
		else
		return 0;
		
	}
}*/
 class SetInterfaceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hashset========================================");
		HashSet h= new HashSet();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add(null);
		h.add("10");
		System.out.println(h);
		System.out.println(h.add("A"));
		
		System.out.println(h);
		
		System.out.println("Linked Hashset===============================");
		
		LinkedHashSet l= new LinkedHashSet();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add(null);
		l.add("10");
		System.out.println(l);
		System.out.println(l.add("A"));
		System.out.println(l);
		
		
System.out.println("Tree ===================================");
		
		TreeSet t= new TreeSet();//new MyComperator());
		t.add("A");
		t.add("B");
		t.add("C");
		t.add("D");
	//	t.add(null);
		t.add("10");
		System.out.println(t);
		System.out.println(t.add("A"));
		System.out.println(t);
	}

}
