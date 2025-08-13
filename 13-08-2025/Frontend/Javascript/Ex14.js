let cities = ["Paris", "Tokyo", "New York", "London", "Sydney", "Berlin"];

document.getElementById("btnAdd").addEventListener("click", function() {
    let dropdown = document.getElementById("cityDropdown");
    
    // Clear previous options except first
    dropdown.options.length = 1;

    // Sort cities alphabetically
    let sortedCities = cities.slice().sort();

    // Add cities to dropdown
    for(let i = 0; i < sortedCities.length; i++) {
        let option = document.createElement("option");
        option.value = sortedCities[i];
        option.text = sortedCities[i];
        dropdown.add(option);
    }
});
