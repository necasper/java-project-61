package hexlet.code.games;

import hexlet.code.Game;

public final class GCD extends Game {

    private static final int UPPER_BOUND_EXCLUSIVE = 100;

    private int a;
    private int b;

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String getQuestion() {
        a = createNumber(UPPER_BOUND_EXCLUSIVE);
        b = createNumber(UPPER_BOUND_EXCLUSIVE);
        return a + " " + b;
    }

    @Override
    public String getResult() {
        return String.valueOf(gcd(a, b));
    }

    private int gcd(int first, int second) {
        if (second == 0) {
            return first; // Base case: when b becomes 0, a is the GCD
        }
        return gcd(second, first % second); // Recursive call: replace a with b, and b with a % b
    }
}
