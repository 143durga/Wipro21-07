import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-checkbox-message',
   standalone: true,
  imports: [CommonModule],
  templateUrl: './checkbox-message.html',
  styleUrl: './checkbox-message.css'
})
export class CheckboxMessage {
  showMessage: boolean = false;
  toggleMessage() {
    this.showMessage = !this.showMessage;
  }
}
