import { Moment } from 'moment';

export class Flight {
    id: number;
    airlines: string;
    source: number;
    destination: string;
    departure_date: Moment;
    departure_time: number;
    arrival_date: Moment;
    arrival_time: number;
    journey_duration: number;
    fare_adult: number;
    fare_child: number;
    total_seats: number;

}
