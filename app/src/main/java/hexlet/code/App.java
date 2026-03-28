package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.GCD;
import hexlet.code.games.Odd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public final class App {

    private static final int CHOICE_GREET = 1;
    private static final int CHOICE_EVEN = 2;
    private static final int CHOICE_CALC = 3;
    private static final int CHOICE_GCD = 4;
    private static final int CHOICE_PROGRESSION = 5;
    private static final int CHOICE_PRIME = 6;
    private static final int CHOICE_EXIT = 0;

    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case CHOICE_GREET:
                Cli.start();
                break;
            case CHOICE_EVEN:
                new Odd().start();
                break;
            case CHOICE_CALC:
                new CalcGame().start();
                break;
            case CHOICE_GCD:
                new GCD().start();
                break;
            case CHOICE_PROGRESSION:
                new Progression().start();
                break;
            case CHOICE_PRIME:
                new Prime().start();
                break;
            case CHOICE_EXIT:
            default:
                break;
        }
    }
}
