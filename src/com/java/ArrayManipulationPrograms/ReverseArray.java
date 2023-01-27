package com.java.ArrayManipulationPrograms;
public class ReverseArray {  
    public static void main(String[] args) {  
        //Initialize array 
    	int i=0;
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        int length=arr.length;
        for(i=0; i<length;i++){
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(i=length-1;i>=0;i--){
        	System.out.print("Reverse==="+arr[i]+ " ");
        }
        
    }  
}  