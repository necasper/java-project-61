package hexlet.code.games;

import hexlet.code.Game;

import java.security.SecureRandom;

public final class Progression implements Game {

    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int INCREMENT_RANGE_EXCLUSIVE = 5;
    private static final int FIRST_TERM_UPPER_EXCLUSIVE = 7;
    private static final int PROGRESSION_LENGTH = 11;
    private static final int REMOVED_INDEX_UPPER_EXCLUSIVE = 10;

    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];
        int current = first;
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(current);
            current += step;
        }
        return progression;
    }

    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public String[] generateRound() {
        int step = RANDOM.nextInt(INCREMENT_RANGE_EXCLUSIVE) + 1;
        int first = RANDOM.nextInt(FIRST_TERM_UPPER_EXCLUSIVE);
        String[] progression = makeProgression(first, step, PROGRESSION_LENGTH);
        int hiddenIndex = RANDOM.nextInt(REMOVED_INDEX_UPPER_EXCLUSIVE);
        String answer = progression[hiddenIndex];
        progression[hiddenIndex] = "..";
        String question = String.join(" ", progression);
        return new String[]{question, answer};
    }
}
