package hexlet.code.games;

import java.util.Scanner;

public class Sequence {
    public static String progression() {
        Scanner sc = new Scanner(System.in);
        int difference = 1 + (int) (Math.random() * 10);
        int element = (int) (Math.random() * 10 + 5);
        int elementsNum = (int) (Math.random() * 10 + 5);
        int hiddenNum = (int) (Math.random() * 10);
        int correctResult = 0;

        String progression = "" + element;

        for (int i = 0; i <= elementsNum; i++) {
            element = element + difference;
            if (i == hiddenNum) {
                correctResult = element;
                progression = progression + " ..";
            } else {
                progression = progression + " " + element;
            }
        }

        System.out.println(progression);
        int userResult = sc.nextInt();
        System.out.println("Your answer: " + userResult);
        if (userResult == correctResult) {
            return "W";
        } else {
            System.out.println("'" + userResult + "' is wrong answer ;(. Correct answer was '" + correctResult + "'.");
            return "L";
        }
    }
}
