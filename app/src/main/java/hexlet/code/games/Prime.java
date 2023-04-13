package hexlet.code.games;

public class Prime {

    static final int HUNDRED_MULTIPLIER = 100;
    static final int ROUNDS = 3;
    static final int Q_AND_A = 2;

    public static String[][] prime() {

        String[][] data = new String[ROUNDS][Q_AND_A];

        for (var round : data) {

            int num = (int) (Math.random() * HUNDRED_MULTIPLIER);
            round[0] = "" + num;
            String correctAnswer = "yes";


            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    correctAnswer = "no";
                    break;
                }
            }

            if (num == 1) correctAnswer = "no";

            round[1] = correctAnswer;
        }

        return data;

    }
}
