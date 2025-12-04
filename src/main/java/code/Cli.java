package code;

import java.util.Scanner;

public class Cli {

    private final static Scanner scanner = new Scanner(System.in);
    private static String name;

    public static void start() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }
}
