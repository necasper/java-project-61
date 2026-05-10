package hexlet.code.games;

import hexlet.code.Game;

import java.security.SecureRandom;

public final class GCD implements Game {

    private static final int UPPER_BOUND_EXCLUSIVE = 100;

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String[] nextRound(SecureRandom random) {
        int a = random.nextInt(UPPER_BOUND_EXCLUSIVE);
        int b = random.nextInt(UPPER_BOUND_EXCLUSIVE);
        String question = a + " " + b;
        String answer = String.valueOf(gcd(a, b));
        return new String[]{question, answer};
    }

    private int gcd(int first, int second) {
        if (second == 0) {
            return first;
        }
        return gcd(second, first % second);
    }
}
