package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetUser;
import static hexlet.code.games.Calc.runCalc;
import static hexlet.code.games.Even.runEven;
import static hexlet.code.games.GCD.runGCD;
import static hexlet.code.games.Prime.runPrime;
import static hexlet.code.games.Progression.runProgression;

class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        int userChoice = sc.nextInt();

        System.out.println("Your choice: " + userChoice + "\n");


        switch (userChoice) {
            case GREET:
                greetUser();
                break;

            case EVEN:
                runEven();
                break;

            case CALC:
                runCalc();
                break;

            case GCD:
                runGCD();
                break;

            case PROGRESSION:
                runProgression();
                break;

            case PRIME:
                runPrime();
                break;

            default:
                break;
        }
    }
}
