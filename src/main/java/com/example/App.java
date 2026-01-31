package com.example;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;

public class App {

    static final List<String> QUOTES = List.of(
            "Ship it. Fix it later.",
            "Works on my machine.",
            "Premature optimization is the root of all evil.",
            "First make it work. Then make it right. Then make it fast.",
            "Any sufficiently advanced bug is indistinguishable from a feature."
    );

    public static void main(String[] args) {
        System.out.println(getGreeting(LocalTime.now()));
        System.out.println("Hello World!");
        System.out.println("Quote of the run: " + getRandomQuote(new Random()));
    }

    static String getGreeting(LocalTime time) {
        int hour = time.getHour();

        if (hour < 12) return "Good morning!";
        if (hour < 18) return "Good afternoon!";
        return "Good evening!";
    }

    static String getRandomQuote(Random random) {
        return QUOTES.get(random.nextInt(QUOTES.size()));
    }
}
