package PoolGame.strategy;

/** Holds strategy for when balls enter a pocket. */
public abstract class PocketStrategy {
    /** Number of lives the ball has. */
    protected int lives;

    /**
     * Removes a life from the ball and determines if ball should be active.
     * 
     * @return true if ball should be removed, false otherwise.
     */
    public boolean remove() {
        this.lives--;

        if (this.lives == 0) {
            return true;
        }
        return false;
    }

    /**
     * Remove the ball no matter how many lives left. Sets life to 0.
     */
    public void forceRemove() {
        this.lives = 0;
    }

    /**
     * Get current lives of the ball.
     * 
     * @return number of lives left.
     */
    public int getLives() {
        return this.lives;
    }

    /**
     * Sets the current life of the ball.
     * 
     * @param lives number of lives given.
     */
    public void setLives(int lives) {
        this.lives = lives;
    }

    /**
     * Resets the ball to its original state.
     */
    public abstract void reset();
}
