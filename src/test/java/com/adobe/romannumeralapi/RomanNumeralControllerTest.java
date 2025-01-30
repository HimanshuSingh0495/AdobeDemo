package com.adobe.romannumeralapi;

import com.adobe.romannumeralapi.controller.RomanNumeralController;
import com.adobe.romannumeralapi.exception.InvalidInputException;
import com.adobe.romannumeralapi.model.RomanNumeralResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralControllerTest {

    private final RomanNumeralController controller = new RomanNumeralController();

    @Test
    public void testValidNumbers() {
        assertEquals("I", controller.convertToRoman(1).getOutput());
        assertEquals("X", controller.convertToRoman(10).getOutput());
        assertEquals("XLII", controller.convertToRoman(42).getOutput());
        assertEquals("MMMCMXCIX", controller.convertToRoman(3999).getOutput());
    }

    @Test
    public void testInvalidNumbers() {
        assertThrows(InvalidInputException.class, () -> controller.convertToRoman(0));
        assertThrows(InvalidInputException.class, () -> controller.convertToRoman(-5));
        assertThrows(InvalidInputException.class, () -> controller.convertToRoman(4000));
    }
}
