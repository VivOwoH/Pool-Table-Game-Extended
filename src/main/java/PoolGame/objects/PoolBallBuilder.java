package PoolGame.objects;

import PoolGame.strategy.PocketStrategy;

import java.util.Arrays;
import PoolGame.Config;
import PoolGame.strategy.BallStrategyOne;
import PoolGame.strategy.BallStrategyThree;
import PoolGame.strategy.BallStrategyTwo;

/** Builds pool balls. */
public class PoolBallBuilder implements BallBuilder {
    // Required Parameters
    private String colour;
    private double xPosition;
    private double yPosition;
    private double xVelocity;
    private double yVelocity;
    private double mass;
    private int score;

    // Variable Parameters
    private boolean isCue = false;
    private PocketStrategy strategy;

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    };

    @Override
    public void setxPos(double xPosition) {
        this.xPosition = xPosition;
    };

    @Override
    public void setyPos(double yPosition) {
        this.yPosition = yPosition;
    };

    @Override
    public void setxVel(double xVelocity) {
        this.xVelocity = xVelocity;
    };

    @Override
    public void setyVel(double yVelocity) {
        this.yVelocity = yVelocity;
    };

    @Override
    public void setMass(double mass) {
        this.mass = mass;
    };

    /**
     * Builds the ball.
     * 
     * @return ball
     */
    public Ball build() {
        if (colour.equals("white")) {
            isCue = true;
            strategy = new BallStrategyOne();
        } else if (Arrays.asList(Config.getStrategyOneColor()).contains(colour)) {
            strategy = new BallStrategyOne();
        } else if (Arrays.asList(Config.getStrategyTwoColor()).contains(colour)) {
            strategy = new BallStrategyTwo();
        } else if (Arrays.asList(Config.getStrategyThreeColor()).contains(colour)) {
            strategy = new BallStrategyThree();
        } else {
            throw new IllegalArgumentException("Invalid colour, ball cannot be build.");
        }

        score = Config.getScoreMap().get(colour);

        return new Ball(colour, xPosition, yPosition, xVelocity, yVelocity, mass, score, isCue, strategy);
    }
}
