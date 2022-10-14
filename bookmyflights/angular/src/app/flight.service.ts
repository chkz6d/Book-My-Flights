import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Flight } from './flight';
@Injectable({
  providedIn: 'root'
})
export class FlightService {

  private baseURL = "http://localhost:8080/flights"
  
  constructor(private httpClient: HttpClient) { }
  
  //To get all the list from the database
  getFlightsList(): Observable<Flight[]>{
    return this.httpClient.get<Flight[]>(`${this.baseURL}`);
  }

  //To create Employee
  createFlights(flight: Flight): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, flight);
  }
  getFlightById(id: number): Observable<Flight>{
    return this.httpClient.get<Flight>(`${this.baseURL}/${id}`);
  }
}
