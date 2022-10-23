package PoolGame;

import PoolGame.objects.Ball;
import PoolGame.observer.BallInPocketListener;

public class GameState implements BallInPocketListener {
    private int time = 0;
    private int score = 0;

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
}
