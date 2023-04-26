package hexlet.code.games;

import static hexlet.code.Engine.run;

public class Even {
    private static final int THOUSAND_MULTIPLIER = 1000;
    private static final int ROUNDS = 3;
    private static final int Q_AND_A = 2;
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void runEven() {

        String[][] data = new String[ROUNDS][Q_AND_A];
        String correctAnswer;

        for (var round : data) {
            int number = (int) (Math.random() * THOUSAND_MULTIPLIER);
            round[0] = String.valueOf(number);
            round[1] = isEven(number) ? "yes" : "no";
        }

        run(TASK, data);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
