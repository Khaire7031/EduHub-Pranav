package com.pdk.eduhub;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EduHubPranavApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduHubPranavApplication.class, args);
		System.out.println("--------------------------------------");
		System.out.println("|	 EduHub Pranav Project       |");
		System.out.println("--------------------------------------");
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
