package com.java.ArrayManipulationPrograms;
public class CopyArray {    
    public static void main(String[] args) {        
             //Initialize array     
        int [] arr1 = new int [] {1, 2, 3, 4, 5};  
        int arr2[] = new int[arr1.length];    
          
        for(int i=0; i<arr1.length; i++){
        	System.out.println(arr1[i]+"");
        	arr2[i]=arr1[i];
        	      	
        }
        for(int i=0; i<arr2.length; i++){
        	//arr2[i]=" ";
        	System.out.println(arr2[i]);
        	      	
        }
             
    }    
}    