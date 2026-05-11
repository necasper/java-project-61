package hexlet.code;

/**
 * A game provides rules and three prepared rounds (question and correct answer each).
 */
public interface Game {

    /**
     * @return rules text shown before rounds
     */
    String getRules();

    /**
     * @return three rows, each {@code [question, correctAnswer]}
     */
    String[][] buildRounds();

    default void play() {
        Engine.run(getRules(), buildRounds());
    }
}
