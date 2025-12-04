package hexlet.code.games;

import hexlet.code.IGame;

public class Prime implements IGame {
    private int number;

    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String getQuestion() {
        number = createNumber(100);
        return String.valueOf(number);
    }

    @Override
    public String getResult() {
        return isPrime(number) ? "yes" : "no";
    }

    public static boolean isPrime(int num) {
        // Numbers less than or equal to 1 are not prime.
        if (num <= 1) {
            return false;
        }

        // Check for divisibility from 2 up to the square root of num.
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // If divisible by any number, it's not prime.
            }
        }

        // If no divisors were found in the loop, the number is prime.
        return true;
    }
}
