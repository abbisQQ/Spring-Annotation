package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Load the config file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("config.xml");
				
				
				//Load the beans from spring container using the bean id
				Coach theCoach = context.getBean("someSillyCoach",Coach.class);
				//in case you want to use the default id the above line will be 
				//Coach theCoach = context.getBean("tennisCoach",Coach.class);
				//we use the class name TennisCoach but with the first letter lower case
				System.out.println(theCoach.getDailyWorkOut());
		
	}

}
