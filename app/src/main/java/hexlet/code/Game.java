package hexlet.code;

import java.security.SecureRandom;

public interface Game {

    String getRules();

    String[] nextRound(SecureRandom random);
}
