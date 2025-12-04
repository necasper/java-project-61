package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.OddEvenGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                Cli.start();
                break;
            case 2:
                new OddEvenGame().start();
                break;
            case 3:
                new CalcGame().start();
            default:
                break;
        }
    }
}
