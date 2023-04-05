package hexlet.code.games;

import java.util.Scanner;

public class Sequence {
    public static String progression() {
        Scanner sc = new Scanner(System.in);
        final int minNumOfElements = 5;
        final int dozenMultiplier = 10;
        final int minDifference = 1;
        int difference = minDifference + (int) (Math.random() * dozenMultiplier);
        int element = (int) (Math.random() * dozenMultiplier + minNumOfElements);
        int elementsNum = (int) (Math.random() * dozenMultiplier + minNumOfElements);
        int hiddenNum = (int) (Math.random() * dozenMultiplier);
        int correctAnswer = 0;

        String progression = "Question: " + element;

        for (int i = 0; i <= elementsNum; i++) {
            element = element + difference;
            if (i == hiddenNum) {
                correctAnswer = element;
                progression = progression +  " ..";
            } else {
                progression = progression + " " + element;
            }
        }

        String correctAnswerStr = Integer.toString(correctAnswer);
        System.out.println(progression);
        String userAnswer = sc.next();
        System.out.println("Your answer: " + userAnswer);
        if (userAnswer.equals(correctAnswerStr)) {
            return "W";
        } else {
            System.out.print("'" + userAnswer + "' is wrong answer ;(.");
            System.out.println("Correct answer was " + correctAnswerStr + "'.");
            return "L";
        }
    }
}
