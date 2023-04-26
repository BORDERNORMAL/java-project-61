package hexlet.code.games;

import static hexlet.code.Engine.run;

public class Prime {

    private static final int HUNDRED_MULTIPLIER = 100;
    private static final int ROUNDS = 3;
    private static final int Q_AND_A = 2;
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runPrime() {

        String[][] data = new String[ROUNDS][Q_AND_A];

        for (var round : data) {

            int num = (int) (Math.random() * HUNDRED_MULTIPLIER);
            round[0] = String.valueOf(num);
            round[1] = isPrime(num) ? "yes" : "no";
        }

        run(TASK, data);

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
