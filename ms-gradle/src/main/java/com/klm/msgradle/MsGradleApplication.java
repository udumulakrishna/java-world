package com.klm.msgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsGradleApplication {

	public static void main(String[] args) {
		System.out.println("____________________________");
		System.out.println("Welcome to MS-MVN Project");
		//SpringApplication.run(Microservice1Application.class, args);

		SpringApplication.run(MsGradleApplication.class, args);

		System.out.println("Bye Bye to MS-MVN Project");
		System.out.println("____________________________");
	}

}
