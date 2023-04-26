package hexlet.code.games;


import static hexlet.code.Engine.run;

public class GCD {

    private static final int HUNDRED_MULTIPLIER = 100;
    private static final int ROUNDS = 3;
    private static final int Q_AND_A = 2;
    private static final String TASK = "Find the greatest common divisor of given numbers.";

    public static void runGCD() {

        String[][] data = new String[ROUNDS][Q_AND_A];
        String correctAnswer;

        for (var round : data) {
            int num1 = (int) (Math.random() * HUNDRED_MULTIPLIER);
            int num2 = (int) (Math.random() * HUNDRED_MULTIPLIER);

            round[0] = num1 + " " + num2;
            round[1] = String.valueOf(findGCD(num1, num2));
        }

        run(TASK, data);
    }

    public static int findGCD(int a, int b) {
        int gcd = 0;

        int biggerNum = Math.max(a, b);
        for (int i = biggerNum; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }

        return gcd;
    }

}
