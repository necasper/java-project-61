package code.app.games;

import code.app.Game;

import java.util.ArrayList;
import java.util.List;

public class Progression extends Game {
    int increment;
    List<Integer> progression = new ArrayList<>();
    int result;


    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public String getQuestion() {
        increment = createNumber(5) + 1;
        progression.add(createNumber(7));
        for (int i = 1; i < 11; i++) {
            progression.add(progression.get(i - 1) + increment);
        }

        int removedIndex = createNumber(10);
        result = progression.get(removedIndex);
        progression.set(removedIndex, -1);
        StringBuilder question = new StringBuilder();
        for (int element : progression) {
            if (element == -1) {
                question.append(".. ");
            } else {
                question.append(element).append(" ");
            }
        }
        question.deleteCharAt(question.length() - 1);
        progression = new ArrayList<>();
        return question.toString();
    }

    @Override
    public String getResult() {
        return String.valueOf(result);
    }
}
