package com.FlightBookingSystem.FlightPassenger.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.FlightBookingSystem.FlightPassenger.model.Passenger;

public interface PassengerRepo extends MongoRepository<Passenger, Integer>{


		public Passenger findByEmailId(String emailId);
		//Optional<Passenger> findByirstName(String firstName);
		
	public Passenger findByEmailIdAndPassword(String emailId, String password);

}
