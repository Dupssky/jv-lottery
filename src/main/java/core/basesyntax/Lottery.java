package core.basesyntax;

public class Lottery {
    private final Color randomColor = new ColorSupplier().getRandomColor();
    private final int randomNumber = new NumberSupplier().getRandomNumber();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(randomColor);
        randomBall.setNumber(randomNumber);
        return randomBall;
    }
}
