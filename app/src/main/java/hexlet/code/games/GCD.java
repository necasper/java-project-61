package hexlet.code.games;

import hexlet.code.Game;

public final class GCD extends Game {

    private static final int UPPER_BOUND_EXCLUSIVE = 100;

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    protected String[] nextRound() {
        int a = createNumber(UPPER_BOUND_EXCLUSIVE);
        int b = createNumber(UPPER_BOUND_EXCLUSIVE);
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
