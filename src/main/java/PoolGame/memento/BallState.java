package PoolGame.memento;

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

    public double getXPosition() {
        return this.xPosition;
    }

    public void setXPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    public double getYPosition() {
        return this.yPosition;
    }

    public void setYPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    public double getXVelocity() {
        return this.xVelocity;
    }

    public void setXVelocity(double xVelocity) {
        this.xVelocity = xVelocity;
    }

    public double getYVelocity() {
        return this.yVelocity;
    }

    public void setYVelocity(double yVelocity) {
        this.yVelocity = yVelocity;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getLives() {
        return this.lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
