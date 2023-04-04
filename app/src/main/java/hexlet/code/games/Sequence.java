package hexlet.code.games;

import java.util.Scanner;

public class Sequence {
    public static String progression() {
        Scanner sc = new Scanner(System.in);
        int minimumLimit = 5;
        int dozenMultiplier = 10;
        int ensureDiffIsNotZero = 1;
        int difference = ensureDiffIsNotZero + (int) (Math.random() * dozenMultiplier);
        int element = (int) (Math.random() * dozenMultiplier + minimumLimit);
        int elementsNum = (int) (Math.random() * dozenMultiplier + minimumLimit);
        int hiddenNum = (int) (Math.random() * dozenMultiplier);
        int correctResult = 0;

        String progression = "Question: " + element;

        for (int i = 0; i <= elementsNum; i++) {
            element = element + difference;
            if (i == hiddenNum) {
                correctResult = element;
                progression = progression +  " ..";
            } else {
                progression = progression + " " + element;
            }
        }

        String correctResultStr = Integer.toString(correctResult);
        System.out.println(progression);
        String userResult = sc.next();
        System.out.println("Your answer: " + userResult);
        if (userResult.equals(correctResultStr)) {
            return "W";
        } else {
            System.out.println("'" + userResult + "' is wrong answer ;(. Correct answer was '" + correctResult + "'.");
            return "L";
        }
    }
}
