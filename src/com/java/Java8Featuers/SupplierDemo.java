package com.java.Java8Featuers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierDemo {

	public static void main(String[] args) {


		List<String> list1 = Arrays.asList();

		//System.out.println(list1.stream().map(c->c.getSalary>3000).collect(Collectors.toList());
		System.out.println(list1.stream().findAny());
	}
}
