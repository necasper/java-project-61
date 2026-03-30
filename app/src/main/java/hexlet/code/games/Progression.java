package hexlet.code.games;

import hexlet.code.Game;

import java.util.ArrayList;
import java.util.List;

public final class Progression extends Game {

    private static final int INCREMENT_RANGE_EXCLUSIVE = 5;
    private static final int FIRST_TERM_UPPER_EXCLUSIVE = 7;
    private static final int PROGRESSION_LENGTH = 11;
    private static final int REMOVED_INDEX_UPPER_EXCLUSIVE = 10;
    private static final int HIDDEN_PLACEHOLDER = -1;

    private int result;

    private List<Integer> generateProgression() {
        int increment = createNumber(INCREMENT_RANGE_EXCLUSIVE) + 1;
        List<Integer> progression = new ArrayList<>();
        progression.add(createNumber(FIRST_TERM_UPPER_EXCLUSIVE));
        for (int i = 1; i < PROGRESSION_LENGTH; i++) {
            progression.add(progression.get(i - 1) + increment);
        }
        return progression;
    }

    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public String getQuestion() {
        List<Integer> progression = generateProgression();
        int removedIndex = createNumber(REMOVED_INDEX_UPPER_EXCLUSIVE);
        result = progression.get(removedIndex);
        progression.set(removedIndex, HIDDEN_PLACEHOLDER);
        StringBuilder question = new StringBuilder();
        for (int element : progression) {
            if (element == HIDDEN_PLACEHOLDER) {
                question.append(".. ");
            } else {
                question.append(element).append(" ");
            }
        }
        question.deleteCharAt(question.length() - 1);
        return question.toString();
    }

    @Override
    public String getResult() {
        return String.valueOf(result);
    }
}
