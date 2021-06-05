package com.FlightBookingSystem.FlightPassenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class FlightPassengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightPassengerApplication.class, args);
	}

}
