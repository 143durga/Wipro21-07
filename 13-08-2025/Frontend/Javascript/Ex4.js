let maxLength = 50;

btn1 = document.getElementById("btn1");
btn1.addEventListener("click", function () {
    let input = document.getElementById("input1").value;
    document.getElementById("charCount").textContent =
        (maxLength - input.length) + " characters remaining";
});
