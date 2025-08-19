import { Component } from '@angular/core';
import { DisplayList } from '../display-list/display-list';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [DisplayList],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {

}
