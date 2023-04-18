package hexlet.code.games;

import static hexlet.code.Engine.run;

public class Prime {

    static final int HUNDRED_MULTIPLIER = 100;
    static final int ROUNDS = 3;
    static final int Q_AND_A = 2;

    public static void prime() {

        String[][] data = new String[ROUNDS][Q_AND_A];

        for (var round : data) {

            int num = (int) (Math.random() * HUNDRED_MULTIPLIER);
            round[0] = String.valueOf(num);
            String correctAnswer = isPrime(num) ? "yes" : "no";
            round[1] = correctAnswer;
        }

        String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        run(task, data);

    }

    public static boolean isPrime(int num) {

        boolean answer = true;

        if (num == 0 || num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
