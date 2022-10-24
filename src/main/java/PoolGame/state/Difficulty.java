package PoolGame.state;

import PoolGame.GameManager;

public interface Difficulty {
    public abstract void update(GameManager gameManager, String mode);
}
