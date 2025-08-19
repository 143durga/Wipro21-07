import { Component, signal } from '@angular/core';
import { Home } from './home/home';
import { NgClass } from '@angular/common';
import { NgClassExample } from './ng-class-example/ng-class-example';
import { NgStyleExample } from './ng-style-example/ng-style-example';
import { Home1 } from './home1/home1';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [Home, Home1, NgClass, NgClassExample, NgStyleExample],  
  templateUrl: './app.html',
  styleUrls: ['./app.css']   
})
export class App {
  protected readonly title = signal('thirdapp');

  flag1 = true;
  flag2 = false;
}
