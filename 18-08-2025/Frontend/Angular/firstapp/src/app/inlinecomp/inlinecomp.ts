import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-inlinecomp',
  standalone: true,
  imports: [CommonModule],
   template: `
    <div class="container text-center mt-5">
      <h2 class="text-primary">Hello from Inline Component!</h2>
      <button class="btn btn-success">Click Me</button>
    </div>
  `,
  styles: [`
    h2 { font-weight: bold; }
  `]
})
export class Inlinecomp {

}
