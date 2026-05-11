package hexlet.code.games;

import hexlet.code.Game;

import java.security.SecureRandom;

public final class GCD implements Game {

    private static final int ROUNDS_COUNT = 3;
    private static final int UPPER_BOUND_EXCLUSIVE = 100;

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String[][] buildRounds() {
        SecureRandom random = new SecureRandom();
        String[][] rounds = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            rounds[i] = generateRound(random);
        }
        return rounds;
    }

    private static String[] generateRound(SecureRandom random) {
        int a = random.nextInt(UPPER_BOUND_EXCLUSIVE);
        int b = random.nextInt(UPPER_BOUND_EXCLUSIVE);
        String question = a + " " + b;
        String answer = String.valueOf(gcd(a, b));
        return new String[]{question, answer};
    }

    private static int gcd(int first, int second) {
        if (second == 0) {
            return first;
        }
        return gcd(second, first % second);
    }
}
