package com.luv2code.tdd;

public class FizzBuzz {
    public static String compute(int i) {
        // If number is divisible by 3, print Fizz
        // If number is divisible by 5, print Buzz
        // If number is divisible by 3 and 5, print fizzBuzz
        // If number is not divisible by 3 or 5, print the number;

        if ((i % 3 == 0) && (i % 5 == 0)) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(i);
        }
    }
}
