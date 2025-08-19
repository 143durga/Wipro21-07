import { Component, Input, Output, EventEmitter } from '@angular/core';
import { ITask } from '../itask';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-task-list',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './task-list.html',
  styleUrl: './task-list.css'
})
export class TaskList {
  @Input() tasks: ITask[] = [];
  @Output() removeTask = new EventEmitter<number>();

  onRemoveTask(id: number) {
    this.removeTask.emit(id);
  }
}
