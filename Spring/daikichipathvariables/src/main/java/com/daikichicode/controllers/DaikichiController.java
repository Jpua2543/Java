package com.daikichicode.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {

    // Mapping for travel city
    @RequestMapping("/daikichi/travel/{city}")
    public String travelDestination(@PathVariable("city") String city) {
        return "Congratulations! You will soon travel to " + city + "!";
    }

    // Mapping for lotto number
    @RequestMapping("/daikichi/lotto/{number}")
    public String lottoPrediction(@PathVariable("number") int number) {
        if (number % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers.";
        } else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }
    }
}
