package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    private static final int index = 101;
    private Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt(index);
    }
}
