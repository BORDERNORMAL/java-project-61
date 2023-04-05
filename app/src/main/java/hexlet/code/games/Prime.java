package hexlet.code.games;

import java.util.Scanner;

public class Prime {
    public static String isPrime() {
        Scanner sc = new Scanner(System.in);
        final int hundredMultiplier = 100;

        int num = (int) (Math.random() * hundredMultiplier);
        boolean isPrime = true;
        String correctAnswer = "no";

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            correctAnswer = "yes";
        }

        System.out.println("Question: " + num);

        String userAnswer = sc.next();

        System.out.println("Your answer: " + userAnswer);

        if (userAnswer.equals(correctAnswer)) {
            return "W";
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return "L";
        }
    }
}
