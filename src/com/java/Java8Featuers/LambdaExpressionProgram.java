package com.java.Java8Featuers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

   class LambdaExpressionProgram{

	public static void main(String[] args) {
		Map<String,Integer> items=new HashMap<String, Integer>();
		items.put("A",1);
		items.put("B",2);
		items.put("C",3);
		System.out.println(items);
		
		for(Entry<String, Integer> entry:items.entrySet()){
			System.out.println(entry.getKey()+"======"+entry.getValue());
		}

	}

}
