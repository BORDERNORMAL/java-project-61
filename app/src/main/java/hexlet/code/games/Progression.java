package hexlet.code.games;

import static hexlet.code.Engine.run;

public class Progression {

    private static final int MINIMAL_NUM_OF_ELEMENTS = 5;
    private static final int DOZEN_MULTIPLIER = 10;
    private static final int MINIMAL_DIFFERENCE = 1;
    private static final int ROUNDS = 3;
    private static final int Q_AND_A = 2;

    public static void progression() {

        String[][] data = new String[ROUNDS][Q_AND_A];

        for (var round : data) {

            int difference = MINIMAL_DIFFERENCE + (int) (Math.random() * DOZEN_MULTIPLIER);
            int element = (int) (Math.random() * DOZEN_MULTIPLIER);
            int elementsNum = MINIMAL_NUM_OF_ELEMENTS + (int) (Math.random() * DOZEN_MULTIPLIER);
            int hiddenNumIndex = (int) Math.floor(Math.random() * (elementsNum - 1) + 1);
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i <= elementsNum; i++) {

                element = element + difference;

                if (i == hiddenNumIndex) {
                    round[1] = String.valueOf(element);
                    sb.append(".. ");
                } else {
                    sb.append(element);
                    sb.append(" ");
                }

            }

            round[0] = String.valueOf(sb).trim();
        }

        String task = "What number is missing in the progression?";
        run(task, data);
    }
}
