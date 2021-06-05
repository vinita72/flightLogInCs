package com.FlightBookingSystem.FlightPassenger.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.FlightBookingSystem.FlightPassenger.model.Passenger;
import com.FlightBookingSystem.FlightPassenger.repository.PassengerRepo;


@Service
public class PassengerService {
	
	@Autowired
	 private PassengerRepo repository;
	
	public Passenger savePassenger(Passenger passenger) {
		return repository.save(passenger);
	}
	
	public Passenger fetchPassengerByEmailId(String emailId) {
		return repository.findByEmailId(emailId);
	}
	
	public Passenger fetchPassengerByEmailIdAndPassword(String emailId, String password) {
		return repository.findByEmailIdAndPassword(emailId, password);
	}
}

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		Optional<Passenger> passenger = PassengerRepo.findByirstName(username);
//
//		passenger.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));
//
//        return passenger.map(Passenger::new).get();	}
//}
