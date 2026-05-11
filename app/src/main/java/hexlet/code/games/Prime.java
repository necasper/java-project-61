package hexlet.code.games;

import hexlet.code.Game;

import java.security.SecureRandom;

public final class Prime implements Game {

    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int UPPER_BOUND_EXCLUSIVE = 100;

    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String[] generateRound() {
        int number = RANDOM.nextInt(UPPER_BOUND_EXCLUSIVE);
        String answer = isPrime(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), answer};
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
