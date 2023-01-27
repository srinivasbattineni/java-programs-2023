package com.java.StringPrograms;



final class Test{
	private int i;
	Test(int i){
		this.i=i;
	}
	public Test modify(int i){
		if(this.i==i)
			return this;
		else
			return new Test(i);
	}
	
}

public class CustomImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test(10);
		Test t1=t.modify(100);
		Test t2=t.modify(10);
		System.out.println(t==t1);
		System.out.println(t1==t2);
		System.out.println(t.equals(t2));

	}

}
