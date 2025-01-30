package com.adobe.romannumeralapi.model;

public class RomanNumeralResponse {
    private String input;
    private String output;

    public RomanNumeralResponse(String input, String output) {
        this.input = input;
        this.output = output;
    }

    public String getInput() {
        return input;
    }

    public String getOutput() {
        return output;
    }
}
