package hexlet.code.games;

import java.util.Scanner;

public class Calc {
    public static String calc() {
        Scanner sc = new Scanner(System.in);

        String operation;
        int correctResult;
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 10);
        int operationRes = (int) Math.floor(Math.random() * (3 - 1) + 1);
        if (operationRes == 1) {
            operation = " + ";
            correctResult = num1 + num2;
        } else if (operationRes == 2) {
            operation = " * ";
            correctResult = num1 * num2;
        } else {
            operation = " - ";
            correctResult = num1 - num2;
        }

        System.out.println(num1 + operation + num2);
        int userRes = sc.nextInt();
        System.out.println("Your answer: " + userRes);

        if (userRes == correctResult) {
            return "W";
        }
        System.out.println("'" + userRes + "' is wrong answer ;(. Correct answer was '" + correctResult + "'.");
        return "L";
    }
}
