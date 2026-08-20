package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    private final int MAX_BALL_NUMBER = 100;
    private final Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt(MAX_BALL_NUMBER);
    }
}
