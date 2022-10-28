package PoolGame.strategy;

/** Holds strategy for balls that only have 2 lives */
public class BallStrategyTwo extends PocketStrategy {
    /** Creates a new ball strategy. */
    public BallStrategyTwo() {
        this.lives = 2;
    }

    public void reset() {
        this.lives = 2;
    }
}
