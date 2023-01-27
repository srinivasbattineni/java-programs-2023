package com.java.MultiThreadingPrograms;

 class MyThread1 extends Thread{
	
	public void run(){
		System.out.println("No-arg");
	}
	public void run(int i){
		System.out.println("int-arg=="+i);
	}
}

class OverloadingRunMethod{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MyThread1 t=new MyThread1();
			t.start();
			t.run(10);
			
		}
	}


