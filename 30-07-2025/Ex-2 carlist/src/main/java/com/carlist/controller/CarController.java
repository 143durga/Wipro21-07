package com.carlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String showCarList(Model model) {
        List<String> cars = List.of(
                "Honda Civic",
                "Toyota Corolla",
                "Ford Mustang",
                "Tata Nexon"
        );

        model.addAttribute("cars", cars);
        return "cars"; // refers to cars.html
    }
}
