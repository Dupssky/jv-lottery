package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int index = new Random().nextInt(Color.values().length);
    private final Color color = Color.values()[index];

    public Color getRandomColor() {
        return color;
    }
}
