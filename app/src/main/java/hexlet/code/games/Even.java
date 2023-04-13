package hexlet.code.games;

public class Even {
    static final int THOUSAND_MULTIPLIER = 1000;
    static final int ROUNDS = 3;
    static final int Q_AND_A = 2;
    public static String[][] evenGame() {

        String[][] data = new String[ROUNDS][Q_AND_A];

        for (var round : data) {
            int number = (int) (Math.random() * THOUSAND_MULTIPLIER);
            round[0] = "" + number;
            String correctAnswer = "no";
            if (number % 2 == 0) {
                correctAnswer = "yes";
            }
            round[1] = correctAnswer;
        }

        return data;
    }
}
