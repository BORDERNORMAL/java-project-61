package hexlet.code;

import hexlet.code.games.*;

public class GameChoice {
    public static String runGame(int choice) {
        String result = "";
        if (choice == 2) {
            result = Even.evenGame();
        } else if (choice == 3) {
            result = Calc.calc();
        } else if (choice == 4) {
            result = Factor.divisor();
        } else if (choice == 5) {
            result = Sequence.progression();
        } else if (choice == 6) {
            result = Prime.isPrime();
        }

        return result;
    }
}
