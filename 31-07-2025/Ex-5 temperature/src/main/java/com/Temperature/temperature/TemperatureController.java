package com.Temperature.temperature;

import org.springframework.web.bind.annotation.*;

@RestController 
public class TemperatureController {

    @GetMapping("/tocentigrade/{fahrenheit}")
    public String convertToCentigrade(@PathVariable double fahrenheit) {
        double centigrade = (fahrenheit - 32) * 5 / 9;
        return String.format("Centigrade equivalent of %.1f°F is %.1f°C", fahrenheit, centigrade);
    }
}
