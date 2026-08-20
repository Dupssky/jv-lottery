package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    private final int index = 101;
    private final Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt(index);
    }
}
