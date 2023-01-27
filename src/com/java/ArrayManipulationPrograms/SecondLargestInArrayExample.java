package com.java.ArrayManipulationPrograms;
public class SecondLargestInArrayExample{  
	
	public static void main(String args[]){  
		int a[]={15,16,17,18,19,20,10,11,12,13,14};  
		int b=a.length;
		int i;
		
		int temp;  
			for (i= 0; i < b; i++)   
	        {  
	            for (int j = i + 1; j <b; j++)   
	            {  
	                if (a[i] > a[j])   
	                {  
	                    temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
	                }  
	               
	            } 
	        	//System.out.println(a[i]+" ");
	           
	        }
		
			System.out.println("2nd largest no is "+a[b-2]);
			System.out.println("2nd smallest no is "+a[1]);
	} 
}
	 
