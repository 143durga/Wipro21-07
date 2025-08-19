import { Component } from '@angular/core';
import { NgStyle } from '@angular/common';

@Component({
  selector: 'app-ng-style-example',
  standalone: true,
  imports: [NgStyle],
  templateUrl: './ng-style-example.html',
  styleUrl: './ng-style-example.css'
})
export class NgStyleExample {
  color1 = 'green';
  fontSize1 = '20px';
  flag1 = true;

  toggleFlag() {
    this.flag1 = !this.flag1;
  }
}
