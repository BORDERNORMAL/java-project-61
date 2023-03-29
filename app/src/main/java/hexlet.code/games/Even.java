package hexlet.code.games;

import java.util.Scanner;
import java.lang.Math;

public class Even {
    public static String evenGame() {
        Scanner sc = new Scanner(System.in);

        int number = (int) (Math.random() * 1000);
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
