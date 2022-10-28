package PoolGame.memento;

/** Holds a snapshot of the ball state. */
public class BallState {

    private double xPosition;
    private double yPosition;
    private double xVelocity;
    private double yVelocity;
    private boolean isActive;
    private int lives;

    public BallState(double xPosition, double yPosition,
            double xVelocity, double yVelocity, boolean isActive, int lives) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        this.isActive = isActive;
        this.lives = lives;
    }

    /**
     * Returns the x-coordiante of the ball.
     * 
     * @return x-position
     */
    public double getXPosition() {
        return this.xPosition;
    }

    /**
     * Sets the x-coordinate of the ball.
     * 
     * @param xPosition
     */
    public void setXPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    /**
     * Returns the y-coordinate of the ball.
     * 
     * @return y-position
     */
    public double getYPosition() {
        return this.yPosition;
    }

    /**
     * Sets the y-coordinate of the ball.
     * 
     * @param yPosition
     */
    public void setYPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    /**
     * Returns the x-velocity of the ball.
     * 
     * @return x-velocity
     */
    public double getXVelocity() {
        return this.xVelocity;
    }

    /**
     * Sets the x-velocity of the ball.
     * 
     * @param xVelocity x-velocity
     */
    public void setXVelocity(double xVelocity) {
        this.xVelocity = xVelocity;
    }

    /**
     * Returns the y-velocity of the ball.
     * 
     * @return y-velocity
     */
    public double getYVelocity() {
        return this.yVelocity;
    }

    /**
     * Sets the y-velocity of the ball.
     * 
     * @param yVelocity
     */
    public void setYVelocity(double yVelocity) {
        this.yVelocity = yVelocity;
    }

    /**
     * Returns the active state of the ball.
     * 
     * @return True if active. False otherwise.
     */
    public boolean isActive() {
        return this.isActive;
    }

    /**
     * Sets the active state of the ball.
     * 
     * @param isActive
     */
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * Returns the current lives of the ball.
     * 
     * @return the current lives.
     */
    public int getLives() {
        return this.lives;
    }

    /**
     * Sets the current lives of the ball.
     * 
     * @param lives
     */
    public void setLives(int lives) {
        this.lives = lives;
    }
}
