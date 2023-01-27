package com.java.OppsPrograms;

class Animal{}
class Monkey extends Animal{}
class Test{
	public void m1(Animal a){
		System.out.println("Animal-version");
	}
	public void m1(Monkey m){
		System.out.println("Monkey-version");
	}
}
public class StaticPolymarphism {

	public static void main(String[] args) {
		Test t= new Test();
		Animal a =new Animal();
		t.m1(a);
		
		Monkey m =new Monkey();
		t.m1(m);
		
		Animal a1 =new Monkey();
		t.m1(a1);
	}

}

	

	/* Method resolution is takes care by Java compiler based on Reference type
	 * output is 
	 * 
	 * Animal-version
	Monkey-version
	Animal-version*/
