package hexlet.code;

import java.util.Scanner;

class App {
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
        String username = "";
        int score = 0;
        String gameOutcome = "L";

        final int greeting = 1;
        final int game2 = 2;
        final int game3 = 3;
        final int game4 = 4;
        final int game5 = 5;
        final int game6 = 6;

        if (userChoice == greeting) {
            Cli.greetUser();
            score = -1;
        } else if (userChoice == game2) {
            username = Cli.greetUser();
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            gameOutcome = GameChoice.runGame(userChoice);
        } else if (userChoice == game3) {
            username = Cli.greetUser();
            System.out.println("What is the result of the expression?");
            gameOutcome = GameChoice.runGame(userChoice);
        } else if (userChoice == game4) {
            username = Cli.greetUser();
            System.out.println("Find the greatest common divisor of given numbers.");
            gameOutcome = GameChoice.runGame(userChoice);
        } else if (userChoice == game5) {
            username = Cli.greetUser();
            System.out.println("What number is missing in the progression?");
            gameOutcome = GameChoice.runGame(userChoice);
        } else if (userChoice == game6) {
            username = Cli.greetUser();
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            gameOutcome = GameChoice.runGame(userChoice);
        }

        final int scoreToWin = 3;
        final int scoreToLose = -1;

        while (score < scoreToWin && score > scoreToLose) {
            if (gameOutcome.equals("W")) {
                score++;
            } else {
                score = scoreToLose;
                System.out.println("Let's try again, " + username + "!");
            }

            if (score == scoreToWin) {
                System.out.println("Congratulations, " + username + "!");
            } else if (score > scoreToLose && score < scoreToWin) {
                gameOutcome = GameChoice.runGame(userChoice);
            }
        }
    }
}
