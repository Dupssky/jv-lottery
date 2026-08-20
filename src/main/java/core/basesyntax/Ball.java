package core.basesyntax;

public class Ball {

    private Color color;
    private int number;

    @Override
    public String toString() {
        return "The " + this.color + " ball " + "has number: " + this.number;
    }
}
