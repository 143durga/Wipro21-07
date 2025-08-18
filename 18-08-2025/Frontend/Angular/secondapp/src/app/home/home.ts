import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  imports: [CommonModule],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
  books = [
  { title: 'To Kill a Mockingbird', description: 'A novel about racial injustice in the Deep South.', image: 'https://m.media-amazon.com/images/I/81gepf1eMqL._SY342_.jpg' },
  { title: '1984', description: 'Dystopian story about government surveillance and totalitarianism.', image: 'https://m.media-amazon.com/images/I/61OYuB86NFL._SL1280_.jpg' },
  { title: 'Pride and Prejudice', description: 'Classic romance novel exploring social class and relationships.', image: 'https://m.media-amazon.com/images/I/51BIZl6wfAL._SY445_SX342_.jpg' },
  { title: 'The Great Gatsby', description: 'Story of love and ambition in 1920s America.', image: 'https://m.media-amazon.com/images/I/61cnHV26bOL._SY342_.jpg' },
  { title: 'Moby Dick', description: 'Epic tale of Captain Ahab’s obsession with a white whale.', image: 'https://m.media-amazon.com/images/I/81XS2mY6qfL._SY342_.jpg' },
  { title: 'War and Peace', description: 'Historical novel set during Napoleonic Wars.', image: 'https://m.media-amazon.com/images/I/71eK3ri8ROL._SY342_.jpg' },
  { title: 'The Catcher in the Rye', description: 'Teenager Holden Caulfield’s journey through New York City.', image: 'https://m.media-amazon.com/images/I/7108sdEUEGL._SY342_.jpg' },
  { title: 'The Hobbit', description: 'Fantasy adventure of Bilbo Baggins in Middle-earth.', image: 'https://m.media-amazon.com/images/I/51oVV2AH4cL._SY445_SX342_.jpg' },
  { title: 'Jane Eyre', description: 'A young woman’s struggle for independence and love.', image: 'https://m.media-amazon.com/images/I/710KkUWCZcL._SY342_.jpg' },
  { title: 'The Lord of the Rings', description: 'Epic fantasy saga about the quest to destroy the One Ring.', image: 'https://m.media-amazon.com/images/I/913sMwNHsBL._SL1500_.jpg' },
  { title: 'Harry Potter and the Sorcerer’s Stone', description: 'Young wizard discovers his magical heritage.', image: 'https://m.media-amazon.com/images/I/81q77Q39nEL._SY342_.jpg' },
  { title: 'The Alchemist', description: 'A shepherd’s journey to find his personal legend.', image: 'https://m.media-amazon.com/images/I/41ziEX0PJgL._SY445_SX342_.jpg' },
  { title: 'Brave New World', description: 'Dystopian society controlled by technology and conditioning.', image: 'https://m.media-amazon.com/images/I/41cDU2B8IyL._SY445_SX342_.jpg' },
  { title: 'Wuthering Heights', description: 'Tale of passion and revenge in the Yorkshire moors.', image: 'https://m.media-amazon.com/images/I/41cX8L2oO+L._SX342_SY445_.jpg' },
  { title: 'The Odyssey', description: 'Epic journey of Odysseus returning home after the Trojan War.', image: 'https://m.media-amazon.com/images/I/61cudQwiS3L._SY342_.jpg' },
  { title: 'Crime and Punishment', description: 'Psychological story of guilt and redemption.', image: 'https://m.media-amazon.com/images/I/41oFhKKkg1L._SX342_SY445_.jpg' },
  { title: 'The Kite Runner', description: 'Friendship and redemption set in Afghanistan.', image: 'https://m.media-amazon.com/images/I/51bt7LtryoL._SY445_SX342_.jpg' },
  { title: 'Anna Karenina', description: 'Tragic love story set in 19th century Russia.', image: 'https://m.media-amazon.com/images/I/61Tbf-N2lRL._SX342_SY445_.jpg' },
  { title: 'Les Misérables', description: 'Story of redemption, justice, and love in France.', image: 'https://m.media-amazon.com/images/I/81rhQt-afHL._SY342_.jpg' },
  { title: 'The Chronicles of Narnia', description: 'Fantasy series following children in a magical world.', image: 'https://m.media-amazon.com/images/I/81Ufrdakv4L._SY342_.jpg' }
];
}
