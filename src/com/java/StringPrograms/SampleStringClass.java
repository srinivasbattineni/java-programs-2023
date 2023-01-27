package com.java.StringPrograms;

public class SampleStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= new String("Srini");//in this case memory allocation in heap
		String s2="scp";  //in this case memory allocation in SCP(sTRING CONSTANT POOL)
		s.concat("Battineni");
		System.out.println(s+"======="+s2);
		
		String s1= new String("Srini");
		System.out.println(s==s1);//false
		System.out.println(s.equals(s1));
		
		StringBuffer sb= new StringBuffer("SB ");
		System.out.println(sb.append("Srini"));
		

	}

}
