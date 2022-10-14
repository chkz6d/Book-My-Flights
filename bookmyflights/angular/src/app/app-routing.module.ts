import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateFlightComponent } from './create-flight/create-flight.component';
import { FlightListComponent } from './flight-list/flight-list.component';
const routes: Routes = [
  {path: 'flights', component: FlightListComponent},
  {path: 'create-flight', component: CreateFlightComponent},
  {path: '',redirectTo: 'flights',pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
