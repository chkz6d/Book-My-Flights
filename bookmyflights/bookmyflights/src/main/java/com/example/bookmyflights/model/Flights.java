package com.example.bookmyflights.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "flights")
public class Flights {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "airlines")
	private String airlines;
	
	@Column(name = "source")
	private String source;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "departure_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date departure_date;
	
	@Column(name = "departure_time")
	private Float departure_time;
	
	@Column(name = "arrival_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date arrival_date;
	
	@Column(name = "arrival_time")
	private Float arrival_time;
	
	@Column(name = "journey_duration")
	private Float journey_duration;
	
	@Column(name = "fare_adult")
	private Integer fare_adult;
	
	@Column(name = "fare_child")
	private Integer fare_child;
	
	@Column(name = "total_seats")
	private Integer total_seats;

	
	public Flights() {
		
	}


	public Flights(String airlines, String source, String destination, Date departure_date, Float departure_time,
			Date arrival_date, Float arrival_time, Float journey_duration, Integer fare_adult, Integer fare_child,
			Integer total_seats) {
		super();
		this.airlines = airlines;
		this.source = source;
		this.destination = destination;
		this.departure_date = departure_date;
		this.departure_time = departure_time;
		this.arrival_date = arrival_date;
		this.arrival_time = arrival_time;
		this.journey_duration = journey_duration;
		this.fare_adult = fare_adult;
		this.fare_child = fare_child;
		this.total_seats = total_seats;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getAirlines() {
		return airlines;
	}


	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public Date getDeparture_date() {
		return departure_date;
	}


	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}


	public Float getDeparture_time() {
		return departure_time;
	}


	public void setDeparture_time(Float departure_time) {
		this.departure_time = departure_time;
	}


	public Date getArrival_date() {
		return arrival_date;
	}


	public void setArrival_date(Date arrival_date) {
		this.arrival_date = arrival_date;
	}


	public Float getArrival_time() {
		return arrival_time;
	}


	public void setArrival_time(Float arrival_time) {
		this.arrival_time = arrival_time;
	}


	public Float getJourney_duration() {
		return journey_duration;
	}


	public void setJourney_duration(Float journey_duration) {
		this.journey_duration = journey_duration;
	}


	public Integer getFare_adult() {
		return fare_adult;
	}


	public void setFare_adult(Integer fare_adult) {
		this.fare_adult = fare_adult;
	}


	public Integer getFare_child() {
		return fare_child;
	}


	public void setFare_child(Integer fare_child) {
		this.fare_child = fare_child;
	}


	public Integer getTotal_seats() {
		return total_seats;
	}


	public void setTotal_seats(Integer total_seats) {
		this.total_seats = total_seats;
	}

	
	
	
}
