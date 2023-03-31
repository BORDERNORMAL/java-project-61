package hexlet.code;

import static hexlet.code.games.Calc.calc;
import static hexlet.code.games.Even.evenGame;
import static hexlet.code.games.Factor.divisor;
import static hexlet.code.games.Sequence.progression;

public class GameChoice {
    public static String runGame(int choice) {
        String result = "";
        if (choice == 2) {
            result = evenGame();
        } else if (choice == 3) {
            result = calc();
        } else if (choice == 4) {
            result = divisor();
        } else if (choice == 5) {
            result = progression();
        }

        return result;
    }
}
