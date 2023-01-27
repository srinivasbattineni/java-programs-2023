package com.java.mapvsflatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();
        
        customers.add(new Customer(10, "Srini", "abc@gmail.com", new ArrayList()));
        customers.add(new Customer(20, "Ashok", "abc@gmail.com", new ArrayList()));
        customers.add(new Customer(30, "Ashok1", "abc@gmail.com", new ArrayList()));
        customers.add(new Customer(40, "Srini", "abc@gmail.com", new ArrayList()));

        
      //  List<Customer> list1 = customers.stream().filter(c->c.getId()>2).map(Collectors.toList()));
        
        
        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> customer.getEmail()
        //customer -> customer.getEmail()  one to one mapping
        List<String> emails = customers.stream()
                .map(c -> c.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);

//customer -> customer.getPhoneNumbers()  ->> one to many mapping
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List<List<String>> phoneNumbers = customers.
                stream().map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);

        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> phone Numbers
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phones);
    }
}
