package com.java.CoreJavaPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{  
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int id;  
transient String name;  
 public Student(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
}  

public class SerializationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Serialization
		try{  
			  //Creating the object  
			  Student s1 =new Student(211,"ravi");
			  System.out.println(s1.id+"=========="+s1.name);
			  //Creating stream and writing the object  
			  FileOutputStream fout=new FileOutputStream("f.txt");  
			  ObjectOutputStream out=new ObjectOutputStream(fout);  
			  out.writeObject(s1); 

			  out.flush();  
			  //closing the stream  
			  out.close();  
			  System.out.println("success");  
			  }catch(Exception e){System.out.println(e);} 
		
		//Deserialization
		
		try{  
			  //Creating stream to read the object  
			 FileInputStream f1=new FileInputStream("f.txt");
			  ObjectInputStream in=new ObjectInputStream(f1);
			  Student s=(Student)in.readObject();  
			  //printing the data of the serialized object  
			  System.out.println(s.id+" "+s.name);  
			  //closing the stream  
			  in.close();  
			  }catch(Exception e){System.out.println(e);}  

	}

}
