package hexlet.code;

import java.security.SecureRandom;
import java.util.Scanner;

public interface IGame {

    Scanner scanner = new Scanner(System.in);

    default void start() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        play(name);
    }

    String getRules();

    default void play(String name) {
        System.out.println(getRules());

        for (int i = 0; i < 3; i++) {
            round(name);
        }

        System.out.println("Congratulations, " + name + "!");
    }

    default void round(String name) {
        System.out.println("Question: " + getQuestion());
        System.out.print("Your answer: ");
        String userAnswer = scanner.nextLine();
        checkAnswer(userAnswer, getResult(), name);
    }

    String getQuestion();

    String getResult();

    private static void checkAnswer(String userAnswer, String answer, String name) {
        if (answer.equals(userAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
            System.out.println("Let's try again, " + name);
        }
    }

    default int createNumber(int interval) {
        SecureRandom random = new SecureRandom();
        int number = random.nextInt() % 100;
        return number * interval;
    }
}
