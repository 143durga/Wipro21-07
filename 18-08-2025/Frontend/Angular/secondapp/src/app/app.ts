import { bootstrapApplication } from '@angular/platform-browser';
import { Component } from '@angular/core';
import { RouterModule } from '@angular/router'; 
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { SearchFilter } from './search-filter/search-filter'; 
import { CheckboxMessage } from './checkbox-message/checkbox-message';
import { Home } from './home/home';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FormsModule, CommonModule, CheckboxMessage, SearchFilter, Home ], 
  templateUrl: './app.html', 
  styleUrls: ['./app.css']   
})
export class App {  
  
  // Ex7: String variable for display
  message: string = "Hello, welcome to my Angular app!";

  // Ex10: List of names
  nameList: string[] = ['Anusha', 'Bhavani', 'Charan', 'Durga'];

  // Ex9: Print message to console
  printMessage() {
    console.log("Message from input:", this.message);
  }

  // Ex12: List of countries and dropdown
  countryList: string[] = ['India', 'USA', 'Canada', 'Australia', 'Germany'];
  dropdownCountries: string[] = [];
  
  loadCountries() {
    this.dropdownCountries = this.countryList;
  }

  // Ex13: Selected color for dropdown
  color: string = 'default'; 
}
bootstrapApplication(App)
  .catch(err => console.error(err));