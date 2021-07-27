package com.cw.s1.string.ex1;

public class Ex1Main {
	
	public static void main(String[] args) {
		//날씨 정보를 받아서 조회하는 프로그램
		//날씨 정보는 도시명, 기온, 습도, 상태
		//1. 날씨정보 전체 출력
		//2. 지역 검색 정보 출력
		//3. 지역 정보 추가
		//4. 종료
		
		WeatherController wc=new WeatherController();
		wc.start();
		
//--------	Weather Info Test  ----------
//		WeatherInfo weatherInfo=new WeatherInfo();
//		WeatherDTO [] weatherDTOs=weatherInfo.makeWeather();
//		
//		for(int i=0;i<weatherDTOs.length;i++) {
//			System.out.println(weatherDTOs[i].getCity());
//			System.out.println(weatherDTOs[i].getTem());
//			System.out.println(weatherDTOs[i].getHum());
//			System.out.println(weatherDTOs[i].getCondition());
//			System.out.println("----------------------------------");
//		}
	}

}
