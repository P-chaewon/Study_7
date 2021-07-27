package com.cw.s1.string.ex1;

import java.util.Scanner;

public class WeatherController {
	private WeatherInfo weatherInfo; //멤버변수 선언
	private WeatherView weatherView;
	
	//생성자 호출
	public WeatherController() {
		weatherInfo=new WeatherInfo(); //초기화
		weatherView=new WeatherView();
	}
	
	public void start() {
		System.out.println("Start");
		Scanner sc=new Scanner(System.in);
		boolean check=true;
		
		WeatherDTO [] weathers=weatherInfo.makeWeather();
		while(check) {
			System.out.println("1.전체날씨정보출력\t2.지역검색정보출력\t3.지역정보추가\t4.종료");
			int select=sc.nextInt();
			if(select==1) {
				this.weatherView.view(weathers); //weathers의 모든 정보 출력
				
			}else if(select==2) {
				WeatherDTO weatherDTO=this.weatherInfo.searchWeather(weathers);
				if(weatherDTO!=null) {
					this.weatherView.viwe(weatherDTO);
				}else {
					this.weatherView.view("해당 도시 정보 없음");
				}
				//검색 실패 시 해당도시의 정보 없음 출력
			}else if(select==3) {
				System.out.println("3");
			}else {
				break;
			}
		}
		System.out.println("Finish");
	}
	
}


					
		
		
		
