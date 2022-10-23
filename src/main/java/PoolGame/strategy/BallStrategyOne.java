package PoolGame.strategy;

public class BallStrategyOne extends PocketStrategy {
    /**
     * Creates a new ball strategy.
     */
    public BallStrategyOne() {
        this.lives = 1;
    }

    public void reset() {
        this.lives = 1;
    }
}
