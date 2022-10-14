import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Flight } from '../flight';
import { FlightService } from '../flight.service';

@Component({
  selector: 'app-create-flight',
  templateUrl: './create-flight.component.html',
  styleUrls: ['./create-flight.component.css']
})
export class CreateFlightComponent implements OnInit {

  flight: Flight = new Flight();

  constructor(private flightService: FlightService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveFlight(){
    this.flightService.createFlights(this.flight).subscribe(data =>
      {console.log(data);
       this.goToFlightList();
    },
      error => console.log(error));
  }
  goToFlightList(){
    this.router.navigate(['/flights']);
  }
  onSubmit(){
    console.log(this.flight);
    this.saveFlight();
  }
}
