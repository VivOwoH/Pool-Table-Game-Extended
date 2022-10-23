package PoolGame.strategy;

public class BallStrategyThree extends PocketStrategy {
    /** Creates a new ball strategy. */
    public BallStrategyThree() {
        this.lives = 3;
    }

    public void reset() {
        this.lives = 3;
    }
}
