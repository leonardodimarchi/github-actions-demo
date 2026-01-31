package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;
import java.util.Random;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void shouldReturnMorningGreeting() {
        String greeting = App.getGreeting(LocalTime.of(9, 0));
        assertEquals("Good morning!", greeting);
    }

    @Test
    void shouldReturnAfternoonGreeting() {
        String greeting = App.getGreeting(LocalTime.of(15, 0));
        assertEquals("Good afternoon!", greeting);
    }

    @Test
    void shouldReturnEveningGreeting() {
        String greeting = App.getGreeting(LocalTime.of(20, 0));
        assertEquals("Good evening!", greeting);
    }

    @Test
    void shouldReturnQuoteFromList() {
        Random random = new Random(42); // fixed seed
        String quote = App.getRandomQuote(random);

        assertTrue(App.QUOTES.contains(quote));
    }

    @Test
    void shouldNotReturnNullQuote() {
        String quote = App.getRandomQuote(new Random());
        assertNotNull(quote);
        assertFalse(quote.isBlank());
    }
}
