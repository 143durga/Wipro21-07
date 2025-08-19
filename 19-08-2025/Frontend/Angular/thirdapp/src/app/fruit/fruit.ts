import { Component, Input, Output, EventEmitter } from '@angular/core';
import { IFruit } from '../ifruit';
import { NgIf } from '@angular/common';

@Component({
  selector: 'app-fruit',
  standalone: true,
  imports: [NgIf],
  templateUrl: './fruit.html',
  styleUrls: ['./fruit.css']  
})
export class Fruit {
  @Input() fruit!: IFruit;
  @Output() removeFruit = new EventEmitter<string>();

  buyFruit() {
    alert(`You bought ${this.fruit.name} for ₹${this.fruit.price}`);
  }

  onRemove() {
    this.removeFruit.emit(this.fruit.name);
  }
}
