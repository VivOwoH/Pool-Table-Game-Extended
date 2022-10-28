package PoolGame.memento;

import java.util.List;

import PoolGame.Config;
import PoolGame.objects.Ball;
import PoolGame.observer.BallInPocketListener;

/** Holds a snapshot of the game state. */
public class GameState implements BallInPocketListener {
    private int frame = 0;
    private int time;
    private int score;
    private List<BallState> ballStates;

    public GameState(int time, int score, List<BallState> ballStates) {
        this.time = time;
        this.score = score;
        this.ballStates = ballStates;
    }

    // -------------- Listener event --------------------

    /**
     * Sets what happens when this ball falls into a pocket
     */
    public void onBallInPocketEvent(Ball ball) {
        this.score += ball.getScore();
    }

    // -----------------------------------
    // --------- GETTER/SETTER -----------
    // -----------------------------------

    /**
     * Returns the current time elapsed of the game.
     * 
     * @return time elapsed.
     */
    public int getTime() {
        return this.time;
    }

    /**
     * Sets the time elapsed of the game.  
     * 
     * @param time
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * Increment the timer.
     */
    public void incTime() {
        if (this.frame == Config.getFrameRate()) {
            this.time ++;
            this.frame = 0;
            return;
        }
        this.frame++;
    }

    /**
     * Returns the score of the game.
     * 
     * @return score.
     */
    public int getScore() {
        return this.score;
    }

    /**
     * Sets the score of the game.
     * 
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    } 

    /**
     * Gets all ball states. 
     * 
     * @return ball states.
     */
    public List<BallState> getBallStates() {
        return this.ballStates;
    }
}
