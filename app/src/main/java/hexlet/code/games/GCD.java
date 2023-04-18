package hexlet.code.games;


import static hexlet.code.Engine.run;

public class GCD {

    static final int HUNDRED_MULTIPLIER = 100;
    static final int ROUNDS = 3;
    static final int Q_AND_A = 2;

    public static void divisor() {

        String[][] data = new String[ROUNDS][Q_AND_A];
        String correctAnswer;

        for (var round : data) {
            int num1 = (int) (Math.random() * HUNDRED_MULTIPLIER);
            int num2 = (int) (Math.random() * HUNDRED_MULTIPLIER);

            correctAnswer = findGCD(num1, num2);

            round[0] = num1 + " " + num2;
            round[1] = correctAnswer;
        }

        String task = "Find the greatest common divisor of given numbers.";
        run(task, data);
    }

    public static String findGCD(int a, int b) {
        String gcd = "0";

        int biggerNum = Math.max(a, b);
        for (int i = biggerNum; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = String.valueOf(i);
                break;
            }
        }

        return gcd;
    }

}
