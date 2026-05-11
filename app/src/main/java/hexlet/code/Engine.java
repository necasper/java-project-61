package hexlet.code;

import java.util.Scanner;

public final class Engine {

    private static final int QUESTION_INDEX = 0;
    private static final int ANSWER_INDEX = 1;

    private Engine() {
    }

    public static void run(String rules, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println(rules);

        for (String[] qa : rounds) {
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
