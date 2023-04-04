package hexlet.code.games;

import java.util.Scanner;

public class Even {
    public static String evenGame() {
        Scanner sc = new Scanner(System.in);
        final int thousandMultiplier = 1000;

        int number = (int) (Math.random() * thousandMultiplier);
        System.out.println("Question: " + number);
        String correctAnswer = "no";
        if (number % 2 == 0) {
            correctAnswer = "yes";
        }

        String userAnswer = sc.next();
        System.out.println("Your answer: " + userAnswer);

        if (userAnswer.equals(correctAnswer)) {
            return "W";
        }
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        return "L";
    }
}
