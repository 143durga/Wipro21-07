package com.citylist.controller;


import com.citylist.model.City;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CityController {

    @GetMapping("/cities")
    public String showCityList(Model model) {
        List<City> cities = Arrays.asList(
            new City("New York", "USA"),
            new City("Tokyo", "Japan"),
            new City("Paris", "France"),
            new City("Hyderabad", "India")
        );

        model.addAttribute("cities", cities);
        return "cities";  // Refers to cities.html
    }
}
