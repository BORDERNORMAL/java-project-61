package hexlet.code.games;

import java.util.Scanner;

public class Calc {
    public static String calc() {
        Scanner sc = new Scanner(System.in);

        final int hundredMultiplier = 100;
        final int dozenMultiplier = 10;
        final int plus = 1;
        final int times = 2;
        final int dividedBy = 3;
        String operation;
        int correctAnswer;
        int num1 = (int) (Math.random() * hundredMultiplier);
        int num2 = (int) (Math.random() * dozenMultiplier);
        int randomOperation = (int) Math.floor(Math.random() * (dividedBy - plus) + plus);
        if (randomOperation == plus) {
            operation = " + ";
            correctAnswer = num1 + num2;
        } else if (randomOperation == times) {
            operation = " * ";
            correctAnswer = num1 * num2;
        } else {
            operation = " - ";
            correctAnswer = num1 - num2;
        }

        System.out.println("Question: " + num1 + operation + num2);
        int userAnswer = sc.nextInt();
        System.out.println("Your answer: " + userAnswer);

        if (userAnswer == correctAnswer) {
            return "W";
        }
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        return "L";
    }
}
