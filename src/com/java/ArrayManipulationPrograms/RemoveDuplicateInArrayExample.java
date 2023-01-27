package com.java.ArrayManipulationPrograms;
public class RemoveDuplicateInArrayExample{  
	
	public static void main (String[] args) {  
        
		int arr[] = {10,20,20,30,30,40,50,50};  
        int n = arr.length;  
        int[] temp = new int[n];
        int i=0;
        int j = 0;  
        
        for (i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        
        temp[j++] = arr[n-1];     
        
        // Changing original array  
        for (i=0; i<j; i++){  
            arr[i] = temp[i];  
            System.out.print(arr[i]+" ");
        }  
        
 } 
    
}  