package code.app.games;

import code.app.Game;

public class Odd extends Game {
    private int number;

    @Override
    public String getRules() {
        String rule = "Answer 'yes' if the number is even";
        rule = rule + ", otherwise answer 'no'.";
        return rule;
    }

    @Override
    public String getQuestion() {
        int a = 100;
        number = createNumber(a);
        return String.valueOf(number);
    }

    @Override
    public String getResult() {
        return number % 2 == 0 ? "no" : "yes";
    }
}
