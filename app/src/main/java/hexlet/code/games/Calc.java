package hexlet.code.games;

public class Calc {

    static final int HUNDRED_MULTIPLIER = 100;
    static final int DOZEN_MULTIPLIER = 10;
    static final int PLUS = 1;
    static final int MULTIPLICATION = 2;
    static final int DEDUCTION = 3;
    public static String[][] calc() {

        String[][] data = new String[3][2];

        for (var round : data) {
            int num1 = (int) (Math.random() * HUNDRED_MULTIPLIER);
            int num2 = (int) (Math.random() * DOZEN_MULTIPLIER);
            int randomOperation = (int) Math.floor(Math.random() * (DEDUCTION - PLUS) + PLUS);
            int correctAnswer;

            switch (randomOperation) {
                case PLUS: round[0] = num1 + " + " + num2;
                correctAnswer = num1 + num2;
                round[1] = "" + correctAnswer;
                break;
                case MULTIPLICATION: round[0] = num1 + " * " + num2;
                correctAnswer = num1 * num2;
                round[1] = "" + correctAnswer;
                break;
                default: round[0] = num1 + " - " + num2;
                correctAnswer = num1 - num2;
                round[1] = "" + correctAnswer;
                break;
            }
        }

        return data;
    }
}
