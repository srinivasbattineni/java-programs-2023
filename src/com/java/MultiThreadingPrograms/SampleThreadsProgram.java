package com.java.MultiThreadingPrograms;

 class MyThread extends Thread{
	
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println("Child Thread");
		}
	}
}

class SampleThreadsProgram{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MyThread t=new MyThread();
			//t.run();
			t.start();
			for(int i=0;i<=5;i++){
				System.out.println("Main Thread");
			}
			
		}
	}


