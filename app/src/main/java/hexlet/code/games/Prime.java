package hexlet.code.games;

import java.util.Scanner;

public class Prime {
    public static String isPrime() {
        Scanner sc = new Scanner(System.in);
        int hundredMultiplier = 100;

        int num = (int) (Math.random() * hundredMultiplier);
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println("Question: " + num);

        String userAnswer = sc.next();

        System.out.println("Your answer: " + userAnswer);

        if (isPrime) {
            if (userAnswer.equals("yes")) {
                return "W";
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'yes'.");
                return "L";
            }
        } else {
            if (userAnswer.equals("no")) {
                return "W";
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'no'.");
                return "L";
            }
        }
    }
}
