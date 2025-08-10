package com.userMgmt.weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @GetMapping("/weather")
    public String getWeather(
        @RequestParam String city,
        @RequestParam String day
    ) {
        // You can replace this logic with actual weather API or service
        return "Weather in " + city + " for " + day + " is cloudy.";
    }
}
