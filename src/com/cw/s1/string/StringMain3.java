package com.cw.s1.string;

public class StringMain3 {
	
	public static void main(String[] args) {
		
		String name="hello world";
		
		char ch='o';
		int num=0;
		int count=0;
		boolean check=true;
		while(check) {
			num=name.indexOf(ch,num);
			if(num>0) {
				num=num+1;
				//num++;
				count++;
			}else {
				System.out.println("검색 종료");
				check=false;
			}
			
		}
		System.out.println(ch+"는 "+count+"개 있습니다");

	
	}

}
