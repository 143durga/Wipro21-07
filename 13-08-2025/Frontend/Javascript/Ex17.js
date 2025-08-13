const quizData = [
  {
    question: "What is the capital of France?",
    options: ["Berlin", "Paris", "Rome", "Madrid"],
    answer: "Paris"
  },
  {
    question: "Which planet is known as the Red Planet?",
    options: ["Earth", "Venus", "Mars", "Jupiter"],
    answer: "Mars"
  },
  {
    question: "Who wrote 'Hamlet'?",
    options: ["Shakespeare", "Dickens", "Tolstoy", "Hemingway"],
    answer: "Shakespeare"
  }
];

let currentIndex = 0;
let score = 0;

const questionEl = document.getElementById("question");
const optionsEl = document.getElementById("options");
const feedbackEl = document.getElementById("feedback");
const nextBtn = document.getElementById("next-btn");
const scoreEl = document.getElementById("score");

function loadQuestion() {
  let currentQ = quizData[currentIndex];
  questionEl.textContent = currentQ.question;
  optionsEl.innerHTML = "";
  feedbackEl.textContent = "";
  
  currentQ.options.forEach(opt => {
    let btn = document.createElement("div");
    btn.textContent = opt;
    btn.classList.add("option");
    btn.onclick = () => checkAnswer(opt);
    optionsEl.appendChild(btn);
  });
}

function checkAnswer(selected) {
  let correct = quizData[currentIndex].answer;
  if (selected === correct) {
    feedbackEl.textContent = "✅ Correct!";
    score++;
    scoreEl.textContent = score;
  } else {
    feedbackEl.textContent = "❌ Wrong!";
  }
}

nextBtn.onclick = () => {
  currentIndex++;
  if (currentIndex < quizData.length) {
    loadQuestion();
  } else {
    questionEl.textContent = "Quiz Completed!";
    optionsEl.innerHTML = "";
    feedbackEl.textContent = `Final Score: ${score}/${quizData.length}`;
    nextBtn.style.display = "none";
  }
};

loadQuestion();
