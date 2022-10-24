package PoolGame.memento;

public class StateTracker {
    
    private GameState gameState;

    /**
     * Updates the latest game state for undo.
     * 
     * @param gameState saved game state.
     */
    public void setLastState(GameState gameState) {
        this.gameState = gameState;
    }

    /**
     * Retrieves the latest game state.
     * 
     * @return last game state.
     */
    public GameState getLastState() {
        return this.gameState;
    } 
}
