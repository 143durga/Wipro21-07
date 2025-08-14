const userIdInput = document.getElementById("userId");
const passwordInput = document.getElementById("password");
const statusText = document.getElementById("status");

const loginBtn = document.getElementById("loginBtn");
const logoutBtn = document.getElementById("logoutBtn");

loginBtn.addEventListener("click", () => {
    const userId = userIdInput.value;
    const password = passwordInput.value;

    if (userId && password) {
        localStorage.setItem("userId", userId); // store in localStorage
        statusText.textContent = `Logged in as ${userId}`;
    } else {
        alert("Please enter both User ID and Password.");
    }
});

logoutBtn.addEventListener("click", () => {
    localStorage.removeItem("userId"); // remove from localStorage
    statusText.textContent = "Logged out successfully.";
});
