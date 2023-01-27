package com.java.ColletionPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterfaceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("HashMap Demo===========================HashMap Demo");
		 HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1,"Chiru"); 
		map.put(2,"Bala"); 
		map.put(3,"Nag"); 
		map.put(4,"Venki"); 
		System.out.println(map);
		 
		System.out.println(map.put(3,"Prabhu"));
		Set<Integer> s=map.keySet(); 
		System.out.println(s);
		
		Collection<String> c=map.values(); 
		System.out.println(c);
		Set s1=map.entrySet(); 
		System.out.println(s1);
		
		for(Map.Entry m1 : map.entrySet()){
			System.out.println(m1.getKey()+"......"+m1.getValue());
			
		}
		System.out.println();
		System.out.println();
		
		System.out.println("TreeMap Demo===========================TreeMap Demo");
		
TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		
		tmap.put(1,"Mahesh"); 
		tmap.put(2,"Tarak"); 
		tmap.put(3,"Prabas"); 
		tmap.put(4,"Pavan"); 
		System.out.println(tmap);
		 
		System.out.println(tmap.put(3,"Raviteja"));
		Set<Integer> st=tmap.keySet(); 
		System.out.println(st);
		
		Collection<String> ct=tmap.values(); 
		System.out.println(ct);
		Set st1=tmap.entrySet(); 
		System.out.println(st1);
		
		for(Map.Entry m2 : tmap.entrySet()){
			System.out.println(m2.getKey()+"......"+m2.getValue());
			
		}
	}

}
