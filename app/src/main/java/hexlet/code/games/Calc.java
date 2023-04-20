package hexlet.code.games;

import static hexlet.code.Engine.run;

public class Calc {

    private static final int HUNDRED_MULTIPLIER = 100;
    private static final int DOZEN_MULTIPLIER = 10;
    private static final int PLUS = 1;
    private static final int MULTIPLICATION = 2;
    private static final int DEDUCTION = 3;
    private static final int ROUNDS = 3;
    private static final int Q_AND_A = 2;
    public static void calc() {

        String[][] data = new String[ROUNDS][Q_AND_A];

        for (var round : data) {
            int num1 = (int) (Math.random() * HUNDRED_MULTIPLIER);
            int num2 = (int) (Math.random() * DOZEN_MULTIPLIER);
            int randomOperation = (int) Math.floor(Math.random() * (DEDUCTION - PLUS) + PLUS);
            int correctAnswer;

            switch (randomOperation) {
                case PLUS:
                    round[0] = num1 + " + " + num2;
                    correctAnswer = num1 + num2;
                    round[1] = String.valueOf(correctAnswer);
                    break;

                case MULTIPLICATION:
                    round[0] = num1 + " * " + num2;
                    correctAnswer = num1 * num2;
                    round[1] = String.valueOf(correctAnswer);
                    break;

                case DEDUCTION:
                    round[0] = num1 + " - " + num2;
                    correctAnswer = num1 - num2;
                    round[1] = String.valueOf(correctAnswer);
                    break;

                default:
                    System.out.println("A viable operation couldn't be generated");
                    System.exit(1);
                    break;
            }
        }

        String task = "What is the result of the expression?";
        run(task, data);
    }
}
