package com.cw.s1.wrapper;

public class WrapperMain1 {
	
	public static void main(String[] args) {
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		String s ="10";
		System.out.println(10+s);
		
		Integer i=new Integer(s);
		int num=i.intValue();
		System.out.println(num+10);
		
		s="100";
		num=Integer.parseInt(s);
		System.out.println(num+100);
		
		int n1=10;
		Integer n2=Integer.valueOf(n1);
		
		Double d=Double.valueOf(3.1);
		n1=n2.intValue();
		
	}

}
