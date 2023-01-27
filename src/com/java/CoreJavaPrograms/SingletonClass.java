package com.java.CoreJavaPrograms;

public class SingletonClass {
	
	private static SingletonClass t=null;
	private SingletonClass(){}
	
	public static SingletonClass getSingletonClass() {
		if(t==null){
			t=new SingletonClass();
		}
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonClass sc=SingletonClass.getSingletonClass();
		SingletonClass sc1=SingletonClass.getSingletonClass();
		System.out.println(sc==sc1);
		
		SingletonClass sc2=SingletonClass.getSingletonClass();
		

	}

}
