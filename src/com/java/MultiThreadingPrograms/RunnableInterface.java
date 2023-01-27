
package com.java.MultiThreadingPrograms;

class MyThread3 implements Runnable{
	
	
	public void run(){
		System.out.println("RUN");
	}
	
}

class RunnableInterface{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MyThread3 t=new MyThread3();
			Thread t1= new Thread(t);
			t1.start();
			System.out.println("MAIN");
			
		}
	}



