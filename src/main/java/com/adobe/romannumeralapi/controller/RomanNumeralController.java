package com.adobe.romannumeralapi.controller;

import com.adobe.romannumeralapi.exception.InvalidInputException;
import com.adobe.romannumeralapi.model.RomanNumeralResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/romannumeral")
public class RomanNumeralController {
    private static final Logger logger = LoggerFactory.getLogger(RomanNumeralController.class);

    @GetMapping
    public RomanNumeralResponse convertToRoman(@RequestParam("query") int number) {
        if (number < 1 || number > 3999) {
            throw new InvalidInputException("Invalid input. Number must be between 1 and 3999.");
        }
        return new RomanNumeralResponse(String.valueOf(number), toRoman(number));
    }

    private String toRoman(int number) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                roman.append(numerals[i]);
            }
        }
        return roman.toString();
    }
}
