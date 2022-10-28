package PoolGame.strategy;

/** Holds strategy for balls that only have 3 lives */
public class BallStrategyThree extends PocketStrategy {
    /** Creates a new ball strategy. */
    public BallStrategyThree() {
        this.lives = 3;
    }

    public void reset() {
        this.lives = 3;
    }
}
