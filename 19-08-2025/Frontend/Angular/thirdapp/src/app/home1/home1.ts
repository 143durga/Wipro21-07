import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Fruit } from '../fruit/fruit';
import { IFruit } from '../ifruit';

@Component({
  selector: 'app-home1',
  standalone: true,
  imports: [CommonModule, Fruit],
  templateUrl: './home1.html',
  styleUrl: './home1.css'
})
export class Home1 {
  fruits: IFruit[] = [
    { name: 'Apple', description: 'Red and sweet', image: 'https://cdn.pixabay.com/photo/2016/11/18/13/47/apple-1834639_1280.jpg', price:120 },
    { name: 'Peach', description: 'Sweet and soft', image: 'https://media.istockphoto.com/id/1137630158/photo/single-peach-fruit-with-leaf-isolated-on-white.jpg?s=612x612&w=0&k=20&c=V8OmiANLcA-hGHcyK6QkXRhXvpnUiAcXo6uKnbwTtQ8=', price:140 },
    { name: 'Orange', description: 'Citrus and juicy', image: 'https://media.istockphoto.com/id/477836156/photo/orange-fruit-isolated-on-white.jpg?s=612x612&w=0&k=20&c=NQYciPqF0kRqnDMx7Vy96Qhtx2c37OiKPXtjMR3Oy-Y=', price:60},
    { name: 'Mango', description: 'King of fruits', image: 'https://img.freepik.com/free-psd/delicious-mango-studio_23-2151844823.jpg?semt=ais_hybrid&w=740&q=80',price:150 },
    { name: 'Strawberry', description: 'Small and red', image: 'https://www.pngplay.com/wp-content/uploads/1/Single-Strawberry-Download-Free-PNG.png', price:90 },
    { name: 'Pineapple', description: 'Tropical and sweet', image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2tQ16kiB-xHTEe0SMP9b_bugCH7V9eiNa6g&s', price:70}
  ];

  removeFruit(fruitName: string) {
    console.log("Removing:", fruitName);
    this.fruits = this.fruits.filter(f => f.name !== fruitName);
  }
}
