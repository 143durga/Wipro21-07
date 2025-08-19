import { Component, Output, EventEmitter } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ITask } from '../itask';

@Component({
  selector: 'app-task',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './task.html',
  styleUrl: './task.css'
})
export class Task {
  description: string = '';
  category: string = 'Work';
  private nextId: number = 1;

   @Output() addTask = new EventEmitter<ITask>();

  onAddTask() {
  if (!this.description) return;
   const task: ITask = {
      id: this.nextId++,
      description: this.description,
      category: this.category
    };
    this.addTask.emit(task);  
    this.description = '';    
    this.category = 'Work';
  }
}
