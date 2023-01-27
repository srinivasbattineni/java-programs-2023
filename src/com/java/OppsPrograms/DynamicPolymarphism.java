package com.java.OppsPrograms;

class Parent{
	public void marry(){
		System.out.println("Subba laxmi");
	}
}
class Child extends Parent{
	public void marry(){
		System.out.println("3sha!,9tara!");
	}
}


public class DynamicPolymarphism {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.marry();
		
		Child c=new Child();
		c.marry();
		
		Parent p1=new Child();
		p1.marry();

	}

}

/*Method resolution is takes care by Java compiler based on Runtime Object
 * Output is
 
Subba laxmi
3sha!,9tara!
3sha!,9tara!
*/