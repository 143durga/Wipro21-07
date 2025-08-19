import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-display-list',
   standalone: true,
  imports: [CommonModule],
  templateUrl: './display-list.html',
  styleUrl: './display-list.css'
})
export class DisplayList {
   fruits = [
    { name: 'Apple', description: 'Red and sweet', image: 'https://cdn.pixabay.com/photo/2016/11/18/13/47/apple-1834639_1280.jpg' },
    { name: 'Banana', description: 'Yellow and soft', image: 'https://cdn.pixabay.com/photo/2017/03/01/16/34/banana-2109006_1280.jpg' },
    { name: 'Orange', description: 'Citrus and juicy', image: 'https://media.istockphoto.com/id/477836156/photo/orange-fruit-isolated-on-white.jpg?s=612x612&w=0&k=20&c=NQYciPqF0kRqnDMx7Vy96Qhtx2c37OiKPXtjMR3Oy-Y=' },
    { name: 'Mango', description: 'King of fruits', image: 'https://img.freepik.com/free-psd/delicious-mango-studio_23-2151844823.jpg?semt=ais_hybrid&w=740&q=80' },
    { name: 'Strawberry', description: 'Small and red', image: 'https://www.pngplay.com/wp-content/uploads/1/Single-Strawberry-Download-Free-PNG.png' },
    { name: 'Pineapple', description: 'Tropical and sweet', image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2tQ16kiB-xHTEe0SMP9b_bugCH7V9eiNa6g&s' }
  ];

}
