package hexlet.code;

import java.util.Scanner;
import java.lang.Math;

public class Even {
    public static void evenGame() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = sc.next();
        System.out.println("Hello, " + username + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int score = 0;

        while (score < 3) {
            int number = (int) (Math.random() * 1000);
            System.out.println("Question: " + number);

            String correctAnswer = "no";
            if (number % 2 == 0) {
                correctAnswer = "yes";
            }

            String userAnswer = sc.next();
            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                score++;
                if (score == 3) {
                    System.out.println("Congratulations, " + username + "!");
                }
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'" + ".");
                System.out.println("Let's try again, " + username + "!");
                score = 3;
            }
        }
    }
}
