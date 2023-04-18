package hexlet.code.games;

import static hexlet.code.Engine.run;

public class Even {
    static final int THOUSAND_MULTIPLIER = 1000;
    static final int ROUNDS = 3;
    static final int Q_AND_A = 2;
    public static void evenGame() {

        String[][] data = new String[ROUNDS][Q_AND_A];
        String correctAnswer;

        for (var round : data) {
            int number = (int) (Math.random() * THOUSAND_MULTIPLIER);
            round[0] = String.valueOf(number);
            correctAnswer = isEven(number) ? "yes" : "no";
            round[1] = correctAnswer;
        }

        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        run(task, data);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
