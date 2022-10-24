package PoolGame.state;

import PoolGame.App;
import PoolGame.Config;
import PoolGame.GameManager;

public class Easy implements Difficulty {
    
    public void update(GameManager gameManager, String mode) {
        if (mode.equals("N")) {
            App.initializeAssets(Config.getNormalConfig(), gameManager);
            gameManager.setDifficulty(new Normal());
        } else if (mode.equals("H")) {
            App.initializeAssets(Config.getHardConfig(), gameManager);
            gameManager.setDifficulty(new Hard());
        }
    }
}
