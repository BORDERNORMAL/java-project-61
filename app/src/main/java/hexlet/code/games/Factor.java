package hexlet.code.games;

import java.util.Scanner;

public class Factor {
    public static String divisor() {
        int lesserNum;
        int correctAnswer = 0;
        final int hundredMultiplier = 100;

        int num1 = (int) (Math.random() * hundredMultiplier);
        int num2 = (int) (Math.random() * hundredMultiplier);
        System.out.println("Question: " + num1 + " " + num2);
        lesserNum = Math.min(num1, num2);

        for (int i = 0; i <= lesserNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                correctAnswer = i;
            }
        }

        Scanner sc = new Scanner(System.in);
        int userAnswer = sc.nextInt();

        System.out.println("Your answer: " + userAnswer);
        if (userAnswer == correctAnswer) {
            return "W";
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return "L";
        }
    }
}
