import { Component } from '@angular/core';
import { ITask } from '../itask';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Task } from '../task/task';
import { TaskList } from '../task-list/task-list';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule, FormsModule, Task, TaskList],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
  tasks: ITask[] = [];

  addTask(task: ITask) {
    this.tasks.push(task);
  }

  removeTask(id: number) {
    this.tasks = this.tasks.filter(t => t.id !== id);
  }
}
