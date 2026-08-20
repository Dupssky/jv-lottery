package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int index = new Random().nextInt(Color.values().length);

    public Color getRandomColor() {
        Color color = Color.values()[index];
        return color;
    }
}
