package hexlet.code.games;

public class Sequence {

    static final int MINIMAL_NUM_OF_ELEMENTS = 5;
    static final int DOZEN_MULTIPLIER = 10;
    static final int MINIMAL_DIFFERENCE = 1;

    public static String[][] progression() {

        String[][] data = new String[3][2];

        for (var round : data) {

            int difference = MINIMAL_DIFFERENCE + (int) (Math.random() * DOZEN_MULTIPLIER);
            int element = (int) (Math.random() * DOZEN_MULTIPLIER);
            int elementsNum = MINIMAL_NUM_OF_ELEMENTS + (int) (Math.random() * DOZEN_MULTIPLIER);
            int hiddenNumIndex = (int) (Math.random() * elementsNum);
            String progression = "";

            for (int i = 0; i <= elementsNum; i++) {
                element = element + difference;
                if (i == hiddenNumIndex) {
                    round[1] = "" + element;
                    progression = progression + " ..";
                } else {
                    progression = progression + " " + element;
                }
            }

            round[0] = progression;
        }

        return data;
    }
}
