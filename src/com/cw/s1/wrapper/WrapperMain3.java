package com.cw.s1.wrapper;

public class WrapperMain3 {
	
	public static void main(String[] args) {
		String jumin="991215-2487215";
		int total=0;
		int a=2;
		// 9 5 0 4 2 4 - 2 4 6 9 8 4  : 2는 검증자리
		//*2 3 4 5 6 7   8 9 2 3 4 5 
		//1. 곱의 합 구하기
		//2. 1의 합을 11로 나누어서 나머지 구하기
		//3. 나머지를 11에서 빼기
		//3-1 11에서 나머지를 뺏을 때 두 자리 이상
		//4. 3에서 나온 결과를 다시 10으로 나누어서 그 나머지 구하기
		// 나머지 숫자랑 체크 번호랑 같으면 올바른 번호 
		jumin=jumin.replace("-", "");
		for(int i=0;i<12;i++) {
			String n=jumin.substring(i,i+1);
			int num=Integer.parseInt(n);
			total=total+num*a;
			a=a+1;
			if(a==10) {
				a=2;
			}
		}
		
		System.out.println(total);
		String c=jumin.substring(12);
		int check=Integer.parseInt(c);
		int num2=11-(total%11);
		System.out.println(check);
		System.out.println(num2);
		if(num2==check) {
			System.out.println("올바른 번호");
		}else {
			if(num2>=10&&num2%10==check) {
				System.out.println("올바른번호");
			} else {
				System.out.println("잘못된 번호");
			}
		}
				
				
			
		
		
		
	}

}
