package PoolGame.state;

import PoolGame.App;
import PoolGame.Config;
import PoolGame.GameManager;

public class Hard implements Difficulty {
    
    public void update(GameManager gameManager, String mode) {
        if (mode.equals("E")) {
            App.initializeAssets(Config.getEasyConfig(), gameManager);
            gameManager.setDifficulty(new Easy());
        } else if (mode.equals("N")) {
            App.initializeAssets(Config.getNormalConfig(), gameManager);
            gameManager.setDifficulty(new Normal());
        }
    }
}
