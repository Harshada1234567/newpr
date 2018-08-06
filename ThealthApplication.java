package com.tikox.thealth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThealthApplication {

	public static void main(String[] args) {

		addition sum1=new addition();
sum1.sum();
		SpringApplication.run(ThealthApplication.class, args);
	}
}
