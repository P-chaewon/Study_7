package com.cw.s1.string.ex1;

public class WeatherView {
	
	public void view(String message) {
		
		System.out.println(message);
	}
	
	
	
	//하나의 지역 날씨정보 출력
	public void viwe(WeatherDTO weatherDTO) {
		System.out.println("도시명 \t 기온 \t 습도 \t 날씨");
		System.out.println("-----------------------------");
		System.out.print(weatherDTO.getCity()+"\t ");
		System.out.print(weatherDTO.getTem()+"\t ");
		System.out.print(weatherDTO.getHum()+"\t ");
		System.out.println(weatherDTO.getCondition());
	}
	
	//메서드명 view
	//모든 지역의 날씨정보 출력
	public void view(WeatherDTO [] weathers) {
		System.out.println("도시명 \t 기온 \t 습도 \t 날씨");
		for(int i=0;i<weathers.length;i++) {
			System.out.print(weathers[i].getCity()+"\t ");
			System.out.print(weathers[i].getTem()+"\t ");
			System.out.print(weathers[i].getHum()+"\t ");
			System.out.println(weathers[i].getCondition());
			System.out.println("-----------------------------");
		}
	}
			
	
		
	
	

}
