import { Component } from '@angular/core';
import { NgClass } from '@angular/common';

@Component({
  selector: 'app-ng-class-example',
  standalone: true,
  imports: [NgClass],
  templateUrl: './ng-class-example.html',
  styleUrl: './ng-class-example.css'
})
export class NgClassExample {
  flag1 = true;
  flag2 = false;

  getNgClass() {
    return {
      'app1': this.flag1,
      'app2': this.flag2
    };
  }

   toggleFlags() {
    this.flag1 = !this.flag1;
    this.flag2 = !this.flag2;
  }
}
