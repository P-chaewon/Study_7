package com.cw.s1.string;

import java.util.Scanner;

public class StringMain5 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		String n ="hello world";
		String n2=n.replace('l', 'z');
		
		System.out.println(n);
		System.out.println(n2);
		System.out.println("---------------------------");
		System.out.println("저장할 파일명 입력");
		//String fileName=sc.next();
		String fileName=sc.next();
		//1. . 인덱스 번호 찾기
		int idx=fileName.lastIndexOf('.');
		String etx=fileName.substring(idx+1);
		String [] files= {"jpg", "gif", "png", "svg"};
		boolean check=false;
		
		for(int i=0;i<files.length;i++) {
			if(etx.equals(files[i])) {
				check=true;
				break;
			}
		}
		
		if(check) {
			System.out.println("이미지 파일");
			
		} else {
			System.out.println("이미지 파일 아님");
		}
			
		
		
	
	}

}
