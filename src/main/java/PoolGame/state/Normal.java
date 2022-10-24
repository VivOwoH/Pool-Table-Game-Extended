package PoolGame.state;

import PoolGame.App;
import PoolGame.Config;
import PoolGame.GameManager;

public class Normal implements Difficulty {
    
    public void update(GameManager gameManager, String mode) {
        if (mode.equals("E")) {
            App.initializeAssets(Config.getEasyConfig(), gameManager);
            gameManager.setDifficulty(new Easy());
        } else if (mode.equals("H")) {
            App.initializeAssets(Config.getHardConfig(), gameManager);
            gameManager.setDifficulty(new Hard());
        }
    }
}
