package PoolGame.state;

import PoolGame.App;
import PoolGame.Config;
import PoolGame.GameManager;

public class Normal implements Difficulty {
    
    public void update(GameManager gameManager) {
        App.initializeAssets(Config.getNormalConfig(), gameManager);
    }
}
