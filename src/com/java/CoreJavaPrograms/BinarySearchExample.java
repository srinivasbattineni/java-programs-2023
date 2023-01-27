package com.java.CoreJavaPrograms;
	public class BinarySearchExample{  
	
		public static void main(String args[]){  
        
			int arr[] = {10,20,30,40,50,60,70};
			
			int firstVar=0;
			int lastVar=arr.length-1;
			int middleVar = (firstVar + lastVar)/2; 
						
			int value = 90;  
            
          while( firstVar <= lastVar ){  
             if ( arr[middleVar] < value ){  
               firstVar = middleVar + 1;     
             }else if ( arr[middleVar] == value ){  
               System.out.println("Element is found at index: " + middleVar);  
               break;  
             }else{  
                lastVar = middleVar - 1;  
             }  
             middleVar = (firstVar + lastVar)/2;  
          } 
          
          
          if ( firstVar > lastVar ){  
             System.out.println("Element is not found!");  
          }  
 }  
}  