
package com.java.MultiThreadingPrograms;

class MyThread2 extends Thread{
	
	public void start(){
		super.start();
		System.out.println("START");
	}
	public void run(){
		System.out.println("RUN");
	}
	
}

class ThreadsProgram2{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MyThread2 t=new MyThread2();
			t.start();
			System.out.println("MAIN");
			
		}
	}



