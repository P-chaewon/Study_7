package com.cw.s1.string.ex1;

import java.util.Scanner;

public class WeatherInfo {
	
	private String info;
	private StringBuffer sb;
	
	public WeatherInfo() {
		sb=new StringBuffer();
		sb.append("seoul, 37, 80, 맑음,");
		sb.append("daegu, 43, 90, 지옥,");
		sb.append("busan, -32, 10, 눈,");
		sb.append("jeju, 3, 40, 비");
	}
	
	//메서드 명 searchWeather
	//도시명 입력 받아 전체정보에서 일치하는 도시 찾아서 DTO 리턴
	
	public WeatherDTO searchWeather(WeatherDTO [] weathers) {
		Scanner sc=new Scanner(System.in);
		System.out.println("도시 입력");
		String cityName=sc.next();
		WeatherDTO weatherDTO=null;
		for(int i=0;i<weathers.length;i++) {
			if(weathers[i].getCity().equals(cityName)) {
				weatherDTO=weathers[i];
				break;
			}
		}
		
		return weatherDTO;
	}
	
	
	public WeatherDTO[] makeWeather() {
		info=sb.toString();
//		System.out.println(info);
		
		//파싱(parsing, 하나의 문자열을 자르는 작업)
		String [] strings = info.split(",");
//		System.out.println(strings.length);
		WeatherDTO [] weathers=new WeatherDTO [strings.length/4];
		int j=0;
		for(int i=0;i<weathers.length;i++) {
			//WeatherDTO 객체 생성
			WeatherDTO weatherDTO=new WeatherDTO();
			weatherDTO.setCity(strings[4*i].trim());
			weatherDTO.setTem(strings[4*i+1].trim());
			weatherDTO.setHum(strings[4*i+2].trim());
			weatherDTO.setCondition(strings[4*i+3].trim());
			weathers[i]=weatherDTO;
			
			weatherDTO=new WeatherDTO();
			weatherDTO.setCity("Busan");
			
		}
		


	
		return weathers;
		
		
		
	}
		
}
