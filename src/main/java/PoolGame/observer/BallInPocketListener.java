package PoolGame.observer;

import PoolGame.objects.Ball;

/** Holds listener that listens to the event when balls enter a pocket. */
public interface BallInPocketListener {
    public abstract void onBallInPocketEvent(Ball ball);
}