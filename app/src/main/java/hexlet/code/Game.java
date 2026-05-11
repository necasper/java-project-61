package hexlet.code;

/**
 * A game provides rules and three prepared rounds (question and correct answer each).
 */
public interface Game {

    int ROUNDS_COUNT = 3;

    /**
     * @return rules text shown before rounds
     */
    String getRules();

    /**
     * @return one round as {@code [question, correctAnswer]}
     */
    String[] generateRound();

    /**
     * @return three rows, each {@code [question, correctAnswer]}
     */
    default String[][] buildRounds() {
        String[][] rounds = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            rounds[i] = generateRound();
        }
        return rounds;
    }

    default void play() {
        Engine.run(getRules(), buildRounds());
    }
}
