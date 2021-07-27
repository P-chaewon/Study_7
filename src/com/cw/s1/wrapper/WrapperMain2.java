package com.cw.s1.wrapper;


public class WrapperMain2 {
	
	public static void main(String[] args) {
		//주민번호 입력
		//991214-1234567
		
		//3-5: 봄
		//6-8: 여름
		//9-11: 가을
		//12-2: 겨울
		
		System.out.println("주민번호 입력");
		String str="990714-1234567";
		String year = str.substring(0,2);
		int y=Integer.parseInt(year);
		y = 1900+y;
		int age=2021-y;
		System.out.println(age);
		
		String month=str.substring(2, 4);
		int m=Integer.parseInt(month);
		System.out.println(m);
		if(m>=3&&m<6) {
			System.out.println("봄");
		}else if(m>=6&&m<9) {
			System.out.println("여름");
		}else if(m>=9&&m<12) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
	}

}
