package hexlet.code;

import static hexlet.code.Cli.greetUser;
import static hexlet.code.Even.evenGame;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        String userChoice = sc.next();

        System.out.println("Your choice: " + userChoice);
        System.out.println("");

        if (userChoice.equals("1")) {
            greetUser();
        } else if (userChoice.equals("2")) {
            evenGame();

        }


    }
}
