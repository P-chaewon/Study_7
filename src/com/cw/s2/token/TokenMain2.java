package com.cw.s2.token;

import java.util.StringTokenizer;

public class TokenMain2 {
	
	public static void main(String[] args) {
		
		String str="korea-USA -france*UK*canada-germany";
		//나라별로 파싱
		//모든 나라 이름은 대문자로
		
		str=str.replace("*", "-");
		StringTokenizer st=new StringTokenizer(str, "-");
		
		while(st.hasMoreTokens()) {
			String n=st.nextToken().trim();
			n=n.toUpperCase();
			System.out.println(n);
		}

		
		
	}
	
}
	
