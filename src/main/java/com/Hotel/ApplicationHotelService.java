package com.Hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationHotelService {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationHotelService.class, args);
	}

}
