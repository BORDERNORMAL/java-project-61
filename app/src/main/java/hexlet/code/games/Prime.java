package hexlet.code.games;

public class Prime {

    static final int HUNDRED_MULTIPLIER = 100;

    public static String[][] prime() {

        String[][] data = new String[3][2];

        for (var round : data) {

            int num = (int) (Math.random() * HUNDRED_MULTIPLIER);
            round[0] = "" + num;
            boolean isPrime = true;
            String correctAnswer = "yes";

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    correctAnswer = "no";
                    break;
                }
            }

            round[1] = correctAnswer;
        }

        return data;

    }
}
