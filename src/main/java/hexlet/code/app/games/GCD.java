package hexlet.code.app.games;

import hexlet.code.app.Game;

public class GCD extends Game {
    private int a;
    private int b;

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String getQuestion() {
        a = createNumber(100);
        b = createNumber(100);
        return a + " " + b;
    }

    @Override
    public String getResult() {
        return String.valueOf(gcd(a, b));
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: when b becomes 0, a is the GCD
        }
        return gcd(b, a % b); // Recursive call: replace a with b, and b with a % b
    }
}
