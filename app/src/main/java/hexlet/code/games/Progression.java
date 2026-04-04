package hexlet.code.games;

import hexlet.code.Game;

import java.util.ArrayList;
import java.util.List;

public final class Progression extends Game {

    private static final int INCREMENT_RANGE_EXCLUSIVE = 5;
    private static final int FIRST_TERM_UPPER_EXCLUSIVE = 7;
    private static final int PROGRESSION_LENGTH = 11;
    private static final int REMOVED_INDEX_UPPER_EXCLUSIVE = 10;

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
    protected String[] nextRound() {
        List<Integer> numbers = generateProgression();
        int removedIndex = createNumber(REMOVED_INDEX_UPPER_EXCLUSIVE);
        int answer = numbers.get(removedIndex);

        String[] parts = new String[PROGRESSION_LENGTH];
        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            if (i == removedIndex) {
                parts[i] = "..";
            } else {
                parts[i] = String.valueOf(numbers.get(i));
            }
        }
        String question = String.join(" ", parts);
        return new String[]{question, String.valueOf(answer)};
    }
}
