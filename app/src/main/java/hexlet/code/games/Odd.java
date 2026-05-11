package hexlet.code.games;

import hexlet.code.Game;

import java.security.SecureRandom;

public final class Odd implements Game {

    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int UPPER_BOUND_EXCLUSIVE = 100;

    @Override
    public String getRules() {
        String rule = "Answer 'yes' if the number is even";
        rule = rule + ", otherwise answer 'no'.";
        return rule;
    }

    @Override
    public String[] generateRound() {
        int number = RANDOM.nextInt(UPPER_BOUND_EXCLUSIVE);
        String answer = number % 2 == 0 ? "yes" : "no";
        return new String[]{String.valueOf(number), answer};
    }
}
