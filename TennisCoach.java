package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//bean id someSillyCoach
@Component("someSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Back hand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
