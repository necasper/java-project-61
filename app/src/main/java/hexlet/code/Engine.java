package hexlet.code;

import java.security.SecureRandom;
import java.util.Scanner;

public final class Engine {

    private static final int ROUNDS_COUNT = 3;
    private static final int QUESTION_INDEX = 0;
    private static final int ANSWER_INDEX = 1;

    private final SecureRandom random = new SecureRandom();

    public void run(Game game) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println(game.getRules());

        for (int round = 0; round < ROUNDS_COUNT; round++) {
            String[] qa = game.nextRound(random);
            System.out.println("Question: " + qa[QUESTION_INDEX]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            String answer = qa[ANSWER_INDEX];

            if (answer.equals(userAnswer)) {
                System.out.println("Correct!");
                continue;
            }

            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        }

        System.out.println("Congratulations, " + name + "!");
    }
}

