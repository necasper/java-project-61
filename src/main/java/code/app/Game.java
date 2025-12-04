package code.app;

import java.security.SecureRandom;
import java.util.Scanner;

public abstract class Game {

    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        play(name);
    }

    protected abstract String getRules();

    private void play(String name) {
        System.out.println(getRules());

        for (int i = 0; i < 3; i++) {
            round(name);
        }

        System.out.println("Congratulations, " + name + "!");
    }

    private void round(String name) {
        System.out.println("Question: " + getQuestion());
        System.out.print("Your answer: ");
        String userAnswer = scanner.nextLine();
        checkAnswer(userAnswer, getResult(), name);
    }

    protected abstract String getQuestion();

    protected abstract String getResult();

    private static void checkAnswer(String userAnswer, String answer, String name) {
        if (answer.equals(userAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
            System.out.println("Let's try again, " + name);
        }
    }

    protected int createNumber(int interval) {
        SecureRandom random = new SecureRandom();
        return random.nextInt(interval);
    }
}
