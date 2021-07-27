package com.cw.s1.string;

public class StringMain4 {
	
	public static void main(String[] args) {
		
		String n1="배고파";
		String n2="배고파";
		String n3=new String("배고파");
		String n4=new String("배고파");
		
		System.out.println(n1==n2); //true
		System.out.println(n3==n4); //false
		System.out.println(n1==n3); //false
		
		System.out.println("-------------------------------");
		System.out.println(n1.equals(n2));
		System.out.println(n3.equals(n4));
		System.out.println(n1.equals(n3));
	}

}
