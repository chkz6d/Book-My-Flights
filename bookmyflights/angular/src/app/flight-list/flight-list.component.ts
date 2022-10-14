import { Component, OnInit } from '@angular/core';
import { Flight } from '../flight'
import { FlightService } from '../flight.service';
@Component({
  selector: 'app-flight-list',
  templateUrl: './flight-list.component.html',
  styleUrls: ['./flight-list.component.css']
})
export class FlightListComponent implements OnInit {

  flights: Flight[];
  
  constructor(private flightService: FlightService) { }

  ngOnInit(): void {
    this.getFlights();
  }

  private getFlights(){
    this.flightService.getFlightsList().subscribe(data => {
      this.flights = data;
      console.log(this.flights);
    });
  }

}
