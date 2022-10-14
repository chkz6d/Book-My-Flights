package com.example.bookmyflights.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmyflights.model.Flights;
import com.example.bookmyflights.repository.FlightsRepository;

import java.util.List;
import java.util.Optional;

@CrossOrigin (origins = "http://localhost:4200")
@RestController
public class FlightsController {
	
	@Autowired
	private FlightsRepository flightsRepository;
	
	//get all flights
	@GetMapping("/flights")
	public @ResponseBody Iterable<Flights> getAllFlights(){
		return flightsRepository.findAll();
	}
	
	//create fights rest api
	@PostMapping("/flights")
	public Flights createFlights(@RequestBody Flights flights) {
		List<Flights> list = flightsRepository.findAll();
		for(Flights emp: list) {
			if(emp.getId() == flights.getId()) {
				throw new RuntimeException("Flights IS ALREADY EXIST");
			}
		}
		return flightsRepository.save(flights);
	}
	//fetching employee by ID
	@GetMapping("/flights/{id}")
	public ResponseEntity<Flights> getFlightsById(@PathVariable Integer id) {
		Optional<Flights> optional = flightsRepository.findById(id);
		
		if(!optional.isPresent())
			throw new RuntimeException("Flights IS NOT FOUND, TRY AGAIN!#");
		
		Flights flights = optional.get();
		return ResponseEntity.ok(flights);
	}
}
