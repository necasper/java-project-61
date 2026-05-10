package hexlet.code.games;

import hexlet.code.Game;

import java.security.SecureRandom;

public final class CalcGame implements Game {

    private static final int OPERAND_UPPER_BOUND_EXCLUSIVE = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};

    private static int calculate(int number1, int number2, char operator) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            default:
                throw new IllegalStateException("Unknown operator: " + operator);
        }
    }

    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    public String[] nextRound(SecureRandom random) {
        int number1 = random.nextInt(OPERAND_UPPER_BOUND_EXCLUSIVE);
        int number2 = random.nextInt(OPERAND_UPPER_BOUND_EXCLUSIVE);
        int indexOperator = random.nextInt(OPERATORS.length);
        char operator = OPERATORS[indexOperator];

        String question = number1 + " " + operator + " " + number2;
        int result = calculate(number1, number2, operator);
        return new String[]{question, String.valueOf(result)};
    }
}
