package hexlet.code.games;

import static hexlet.code.Engine.run;

public class Progression {

    static final int MINIMAL_NUM_OF_ELEMENTS = 5;
    static final int DOZEN_MULTIPLIER = 10;
    static final int MINIMAL_DIFFERENCE = 1;
    static final int ROUNDS = 3;
    static final int Q_AND_A = 2;

    public static void progression() {

        String[][] data = new String[ROUNDS][Q_AND_A];

        for (var round : data) {

            int difference = MINIMAL_DIFFERENCE + (int) (Math.random() * DOZEN_MULTIPLIER);
            int element = (int) (Math.random() * DOZEN_MULTIPLIER);
            int elementsNum = MINIMAL_NUM_OF_ELEMENTS + (int) (Math.random() * DOZEN_MULTIPLIER);
            int hiddenNumIndex = (int) Math.floor(Math.random() * (elementsNum - 1) + 1);
            String progression = "";

            for (int i = 0; i <= elementsNum; i++) {

                element = element + difference;

                if (i == hiddenNumIndex) {
                    round[1] = "" + element;
                    if (i == 0) {
                        progression = progression + "..";
                    } else {
                        progression = progression + " ..";
                    }
                } else {
                    if (i == 0) {
                        progression = "" + element;
                    } else {
                        progression = progression + " " + element;
                    }
                }

            }

            round[0] = progression;
        }

        String task = "What number is missing in the progression?";
        run(task, data);
    }
}
