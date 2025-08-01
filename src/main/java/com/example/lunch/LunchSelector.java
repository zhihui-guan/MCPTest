package com.example.lunch;

import java.util.Random;

public class LunchSelector {
    private final Random random;

    public LunchSelector() {
        this.random = new Random();
    }

    public LunchOption selectRandomLunch() {
        LunchOption[] options = LunchOption.values();
        int randomIndex = random.nextInt(options.length);
        return options[randomIndex];
    }

    public String getRandomLunchDescription() {
        return selectRandomLunch().getDescription();
    }
}