package section04_JavaCore.topic04_OOP.practice.Lottery;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(new ColorSupplier().getRandomColor());
        ball.setNumber(new Random().nextInt(BALL_NUMBER));
        return ball;
    }
}
