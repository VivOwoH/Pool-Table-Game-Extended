package PoolGame.observer;

import PoolGame.objects.Ball;

public interface BallInPocketListener {
    public abstract void onBallInPocketEvent(Ball ball);
}