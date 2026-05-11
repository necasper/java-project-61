package hexlet.code.games;

import hexlet.code.Game;

import java.security.SecureRandom;

public final class Odd implements Game {

    private static final int ROUNDS_COUNT = 3;
    private static final int UPPER_BOUND_EXCLUSIVE = 100;

    @Override
    public String getRules() {
        String rule = "Answer 'yes' if the number is even";
        rule = rule + ", otherwise answer 'no'.";
        return rule;
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
        int number = random.nextInt(UPPER_BOUND_EXCLUSIVE);
        String answer = number % 2 == 0 ? "yes" : "no";
        return new String[]{String.valueOf(number), answer};
    }
}
