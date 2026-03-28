package hexlet.code.games;

import hexlet.code.Game;

public final class Odd extends Game {

    private static final int UPPER_BOUND_EXCLUSIVE = 100;

    private int number;

    @Override
    public String getRules() {
        String rule = "Answer 'yes' if the number is even";
        rule = rule + ", otherwise answer 'no'.";
        return rule;
    }

    @Override
    public String getQuestion() {
        number = createNumber(UPPER_BOUND_EXCLUSIVE);
        return String.valueOf(number);
    }

    @Override
    public String getResult() {
        return number % 2 == 0 ? "yes" : "no";
    }
}
