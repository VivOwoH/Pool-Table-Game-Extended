package PoolGame.state;

import PoolGame.GameManager;

/** Holds difficulty mode for when user switches to a different difficulty */
public interface Difficulty {
    /**
     * Updates the game to a different difficulty mode if it is different to the
     * current one.
     * 
     * @param gameManager main class that manages most game logic.
     * @param mode        difficulty to load.
     */
    public abstract void update(GameManager gameManager, String mode);
}
