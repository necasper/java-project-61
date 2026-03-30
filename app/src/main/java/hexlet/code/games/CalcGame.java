package hexlet.code.games;

import hexlet.code.Game;

public final class CalcGame extends Game {

    private static final int OPERAND_UPPER_BOUND_EXCLUSIVE = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};

    private String question;
    private int result;

    private void prepareRound() {
        int number1 = createNumber(OPERAND_UPPER_BOUND_EXCLUSIVE);
        int number2 = createNumber(OPERAND_UPPER_BOUND_EXCLUSIVE);
        int indexOperator = createNumber(OPERATORS.length);
        char operator = OPERATORS[indexOperator];

        question = number1 + " " + operator + " " + number2;
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            default:
                throw new IllegalStateException("Unknown operator: " + operator);
        }
    }

    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    public String getQuestion() {
        prepareRound();
        return question;
    }

    @Override
    public String getResult() {
        return String.valueOf(result);
    }
}
