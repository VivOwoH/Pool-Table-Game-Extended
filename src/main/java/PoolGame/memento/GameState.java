package PoolGame.memento;

import java.util.List;

import PoolGame.objects.Ball;
import PoolGame.observer.BallInPocketListener;

public class GameState implements BallInPocketListener {
    private int time;
    private int score;
    private List<BallState> ballStates;

    public GameState(int time, int score, List<BallState> ballStates) {
        this.time = time;
        this.score = score;
        this.ballStates = ballStates;
    }

    // -------------- Listener event --------------------

    public void onBallInPocketEvent(Ball ball) {
        this.score += ball.getScore();
        System.out.println(score);
    }

    // -----------------------------------
    // --------- GETTER/SETTER -----------
    // -----------------------------------

    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    } 

    public List<BallState> getBallStates() {
        return this.ballStates;
    }
}
