package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeployToAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployToAwsApplication.class, args);
		System.out.println("Hello");
	
	}
}

