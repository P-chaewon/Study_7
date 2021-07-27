package com.cw.s1.string;

public class StringMain2 {
	
	public static void main(String[] args) {
		
		//String name = new String("hello world");
		String name="hello world";
		
		char ch=name.charAt(0);
		System.out.println(ch);
		
		name="991012-2234567";
		
		//성별 판별
		ch=name.charAt(7);
		System.out.println(ch);
		if(ch=='2'||ch=='4') {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
		
		ch=name.charAt(200);
		System.out.println(ch);
	}

}
