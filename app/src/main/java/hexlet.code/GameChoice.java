package hexlet.code;

import static hexlet.code.games.Calc.calc;
import static hexlet.code.games.Cli.greetUser;
import static hexlet.code.games.Even.evenGame;

public class GameChoice {
    public static String runGame(int choice) {
        String result = "";
        if (choice == 2) {
            result = evenGame();
        } else if (choice == 3) {
            result = calc();
        }

        return result;
    }
}
