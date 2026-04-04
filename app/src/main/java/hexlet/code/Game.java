package hexlet.code;

import java.security.SecureRandom;
import java.util.Scanner;

public abstract class Game {

    private static final int ROUNDS_COUNT = 3;
    private static final int QUESTION_INDEX = 0;
    private static final int ANSWER_INDEX = 1;
    private static final SecureRandom RANDOM = new SecureRandom();

    private final Scanner scanner = new Scanner(System.in);

    public final void start() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        play(name);
    }

    protected abstract String getRules();

    private void play(String name) {
        System.out.println(getRules());

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            if (!round(name)) {
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }

    private boolean round(String name) {
        String[] qa = nextRound();
        System.out.println("Question: " + qa[QUESTION_INDEX]);
        System.out.print("Your answer: ");
        String userAnswer = scanner.nextLine();
        return checkAnswer(userAnswer, qa[ANSWER_INDEX], name);
    }

    protected abstract String[] nextRound();

    private static boolean checkAnswer(String userAnswer, String answer, String name) {
        if (answer.equals(userAnswer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
        System.out.println("Let's try again, " + name + "!");
        return false;
    }

    protected final int createNumber(int interval) {
        return RANDOM.nextInt(interval);
    }
}
