const movie = {
  movieName: "MyDemon",
  movieLanguage: "Korean",
  imdbRating: 8.8
};

// ES6 destructuring
const { movieName, movieLanguage, imdbRating } = movie;

// Printing values
console.log("Movie Name:", movieName);       
console.log("Language:", movieLanguage);     
console.log("IMDB Rating:", imdbRating);     
