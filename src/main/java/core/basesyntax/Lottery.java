package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Color randomColor = new ColorSupplier().getRandomColor();
    private final int MAX_BALL_NUMBER = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(randomColor);
        randomBall.setNumber(random.nextInt(MAX_BALL_NUMBER));
        return randomBall;
    }
}
