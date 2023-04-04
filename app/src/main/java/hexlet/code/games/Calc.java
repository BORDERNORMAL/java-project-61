package hexlet.code.games;

import java.util.Scanner;

public class Calc {
    public static String calc() {
        Scanner sc = new Scanner(System.in);

        int hundredMultiplier = 100;
        int dozenMultiplier = 10;
        int plus = 1;
        int times = 2;
        int divide = 3;
        String operation;
        int correctResult;
        int num1 = (int) (Math.random() * hundredMultiplier);
        int num2 = (int) (Math.random() * dozenMultiplier);
        int operationRes = (int) Math.floor(Math.random() * (divide - plus) + plus);
        if (operationRes == plus) {
            operation = " + ";
            correctResult = num1 + num2;
        } else if (operationRes == times) {
            operation = " * ";
            correctResult = num1 * num2;
        } else {
            operation = " - ";
            correctResult = num1 - num2;
        }

        System.out.println("Question: " + num1 + operation + num2);
        int userRes = sc.nextInt();
        System.out.println("Your answer: " + userRes);

        if (userRes == correctResult) {
            return "W";
        }
        System.out.println("'" + userRes + "' is wrong answer ;(. Correct answer was '" + correctResult + "'.");
        return "L";
    }
}
