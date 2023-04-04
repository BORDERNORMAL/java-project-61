package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Factor;
import hexlet.code.games.Prime;
import hexlet.code.games.Sequence;

public class GameChoice {
    public static String runGame(int choice) {
        final int game2 = 2;
        final int game3 = 3;
        final int game4 = 4;
        final int game5 = 5;
        final int game6 = 6;

        String result = "";
        if (choice == game2) {
            result = Even.evenGame();
        } else if (choice == game3) {
            result = Calc.calc();
        } else if (choice == game4) {
            result = Factor.divisor();
        } else if (choice == game5) {
            result = Sequence.progression();
        } else if (choice == game6) {
            result = Prime.isPrime();
        }

        return result;
    }
}
