package hexlet.code.games;

public class Even {
    static final int THOUSAND_MULTIPLIER = 1000;
    public static String[][] evenGame() {

        String[][] data = new String[3][2];

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
