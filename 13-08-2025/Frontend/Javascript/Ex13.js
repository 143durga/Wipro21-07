function validateEmail() {
    let email = document.getElementById("email").value.trim();
    let emailError = document.getElementById("emailError");
    let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (email === "") {
        emailError.textContent = "Email is required";
        emailError.style.visibility = "visible";
    } else if (!emailPattern.test(email)) {
        emailError.textContent = "Invalid email format";
        emailError.style.visibility = "visible";
    } else {
        emailError.style.visibility = "hidden";
    }
}

function validatePassword() {
    let pass = document.getElementById("password").value.trim();
    let passError = document.getElementById("passError");

    if (pass === "") {
        passError.textContent = "Password is required";
        passError.style.visibility = "visible";
    } else {
        passError.style.visibility = "hidden";
    }
}

function handleLogin() {
    validateEmail();
    validatePassword();
}
