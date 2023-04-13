package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetUser;
import static hexlet.code.Engine.run;
import static hexlet.code.games.Calc.calc;
import static hexlet.code.games.Even.evenGame;
import static hexlet.code.games.GCD.divisor;
import static hexlet.code.games.Prime.prime;
import static hexlet.code.games.Sequence.progression;

class App {
    final static int GREET = 1;
    final static int EVEN = 2;
    final static int CALC = 3;
    final static int GCD = 4;
    final static int PROGRESSION = 5;
    final static int PRIME = 6;
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

        System.out.println("Your choice: " + userChoice);
        System.out.println("");
        String task;
        String[][] data;


        switch (userChoice) {
            case GREET: greetUser();
            break;
            case EVEN: data = evenGame();
            task = "Answer 'yes' if the given number is even, otherwise answer 'no'.";
            run(task, data);
            break;
            case CALC: data = calc();
            task = "What is the result of the expression?";
            run(task, data);
            break;
            case GCD: data = divisor();
            task = "Find the greatest common divisor of given numbers.";
            run(task, data);
            break;
            case PROGRESSION: data = progression();
            task = "What number is missing in the progression?";
            run(task, data);
            break;
            case PRIME: data = prime();
            task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
            run(task, data);
            break;
            default: break;
        }
    }
}
