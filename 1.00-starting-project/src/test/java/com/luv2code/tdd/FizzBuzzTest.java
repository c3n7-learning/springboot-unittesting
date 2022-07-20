package com.luv2code.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {
    // If number is divisible by 3, print Fizz
    @Test
    @Order(1)
    @DisplayName("Divisble By Three")
    void testForDivisionByThree() {
        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");
    }

    // If number is divisible by 5, print Buzz
    @Test
    @Order(2)
    @DisplayName("Divisble By Five")
    void testForDivisionByFive() {
        String expected = "Buzz";

        assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");
    }

    // If number is divisible by 3 and 5, print fizzBuzz
    @Test
    @Order(3)
    @DisplayName("Divisible By Three and Five")
    void testForDivisionByThreeAndFive() {
        String expected = "FizzBuzz";

        assertEquals(expected, FizzBuzz.compute(15), "Should return FizzBuzz");
    }

    // If number is not divisible by 3 or 5, print the number;
    @Test
    @Order(4)
    @DisplayName("Not Divisible By Three or Five")
    void testForDivisionByThreeOrFive() {
        String expected = "1";

        assertEquals(expected, FizzBuzz.compute(1), "Should return 1");
    }
}
