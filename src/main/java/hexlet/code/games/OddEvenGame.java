package hexlet.code.games;

import hexlet.code.IGame;

public class OddEvenGame implements IGame {
    private int number;

    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String getQuestion() {
        number = createNumber(100);
        return String.valueOf(number);
    }

    @Override
    public String getResult() {
        return number % 2 == 0 ? "no" : "yes";
    }
}
