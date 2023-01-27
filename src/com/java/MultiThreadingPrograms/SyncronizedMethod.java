package com.java.MultiThreadingPrograms;

class Display{
	
	public  synchronized void wish(String name){
		for(int i=0; i<=2;i++){
			System.out.println(" Good Morning!!!!!"+name);
			try {
				Thread.sleep(100);
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
class MyThread5 extends Thread{
	Display d;
	String name;
	MyThread5(Display d,String name){
		this.d=d;
		this.name=name;
	}
		public void run(){
			d.wish(name);
		}
}
public class SyncronizedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d=new Display();
		
		MyThread5 t5=new MyThread5(d,"Srini");
		MyThread5 t6=new MyThread5(d,"Anu");
		t5.start();
		t6.start();

	}

}
