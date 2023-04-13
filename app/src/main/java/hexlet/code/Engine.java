package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void run(String task, String[][] data) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = sc.next();
        System.out.println("Hello, " + username + "!");

        System.out.println(task);

        int score = 0;

        for (var round : data) {
            System.out.println("Question: " + round[0]);
            String userAnswer = sc.next();
            System.out.println("Your answer: " + userAnswer);
            if (userAnswer.equals(round[1])) {
                score++;
            } else {
                System.out.println("'" + userAnswer + "' was wrong answer ;(. Correct answer was '" + round[1] + "'.");
                System.out.println("Let's try again, " + username + "!");
                break;
            }
        }

        if (score == 3) {
            System.out.println("Congratulations, " + username + "!");
        }
    }
}
