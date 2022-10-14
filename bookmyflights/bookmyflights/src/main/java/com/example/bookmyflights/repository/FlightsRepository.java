package com.example.bookmyflights.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookmyflights.model.Flights;

@Repository
public interface FlightsRepository extends JpaRepository<Flights, Integer>{

}