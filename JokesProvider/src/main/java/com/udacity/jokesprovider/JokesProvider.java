package com.udacity.jokesprovider;

import java.util.Random;

public class JokesProvider {

    private String[] jokes = {
            "Q. What is the biggest lie in the entire universe? \n A. \"I have read and agree to the Terms & Conditions.\"",
            "The best thing about IPv4 jokes is that you can tell them 254 times before they’re exhausted.",
            "Why are iPhone chargers not called Apple Juice?!",
            "I just got fired from my job at the keyboard factory. They told me I wasn't putting in enough shifts.",
            "My computer suddenly started belting out \"Someone Like You.\" It's a Dell."
    };

    private Random random;

    public String getJoke() {
        random = new Random();
        return jokes[random.nextInt(jokes.length)];
    }

}