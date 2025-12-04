package code.app;

import code.Cli;
import code.app.games.*;

import java.util.Scanner;

public class App {
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
            case 1:
                Cli.start();
                break;
            case 2:
                new Odd().start();
                break;
            case 3:
                new CalcGame().start();
                break;
            case 4:
                new GCD().start();
                break;
            case 5:
                new Progression().start();
                break;
            case 6:
                new Prime().start();
                break;
            default:
                break;
        }
    }
}
