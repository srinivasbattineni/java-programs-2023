package com.java.MultiThreadingPrograms;

class MyThread4 extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println("BSR");
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException ie) {
				// TODO: handle exception
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class ThreadExecutionPrevent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread4 t4=new MyThread4();
		t4.start();
		t4.join();
		for(int i=0;i<=5;i++){
			System.out.println("ANU");
		}
		

	}

}
