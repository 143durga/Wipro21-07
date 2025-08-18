import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-search-filter',
  imports: [CommonModule, FormsModule],
  templateUrl: './search-filter.html',
  styleUrl: './search-filter.css'
})
export class SearchFilter {
  names: string[] = ['Jayanta', 'Jayaram', 'Arun', 'Bhavani', 'Charan', 'Durga'];
   searchText: string = '';
  get filteredNames(): string[] {
    if (!this.searchText) {
      return this.names;
      }
      return this.names.filter(name =>
      name.toLowerCase().includes(this.searchText.toLowerCase())
    );
  }
}
