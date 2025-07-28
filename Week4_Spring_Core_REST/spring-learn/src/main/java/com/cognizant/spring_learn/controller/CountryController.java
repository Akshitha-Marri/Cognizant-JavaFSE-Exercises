package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.Country;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountryIndia() {
        return new Country("IN", "India");
    }

    @GetMapping("/countries/{code}")
    public Country getCountryByCode(@PathVariable("code") String code) { // <-- FIXED HERE
        if (code.equalsIgnoreCase("IN")) {
            return new Country("IN", "India");
        } else if (code.equalsIgnoreCase("US")) {
            return new Country("US", "United States");
        } else {
            throw new RuntimeException("Country not found for code: " + code);
        }
    }
}
