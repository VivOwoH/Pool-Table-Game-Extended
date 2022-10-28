package PoolGame;

import java.util.HashMap;

/** Holds static final data. */
public class Config {
    private static final double FRAMERATE = 60;
    private static final double TABLEBUFFER = 50;
    private static final double TABLEEDGE = 10;
    private static final double CUESTICKLENGTH = 350;
    private static final String configPathEasy = "src/main/resources/config_easy.json";
    private static final String configPathNormal = "src/main/resources/config_normal.json";
    private static final String configPathHard = "src/main/resources/config_hard.json";

    private static final String[] availableColor = { "orange", "yellow", "red", "green", "purple",
            "blue", "black", "brown" };
    private static final String[] strategyOneColor = { "orange", "yellow", "red" };
    private static final String[] strategyTwoColor = { "green", "purple", "blue" };
    private static final String[] strategyThreeColor = { "black", "brown" };
    private static final HashMap<String, Integer> scoreMap = new HashMap<>() {
        {
            put("white", 0);
            put("red", 1);
            put("yellow", 2);
            put("green", 3);
            put("brown", 4);
            put("blue", 5);
            put("purple", 6);
            put("black", 7);
            put("orange", 8);
        }
    };

    /**
     * Returns all possible colors of balls (even such colored balls are not on
     * screen).
     * 
     * @return all colour strings.
     */
    public static String[] getAvailableColor() {
        return availableColor;
    }

    /**
     * Returns all the colors of the balls that will perform strategy one when
     * falling into pockets.
     * 
     * @return array of strategy one color strings.
     */
    public static String[] getStrategyOneColor() {
        return strategyOneColor;
    }

    /**
     * Returns all the colors of the balls that will perform strategy two when
     * falling into pockets.
     * 
     * @return array of strategy two color strings.
     */
    public static String[] getStrategyTwoColor() {
        return strategyTwoColor;
    }

    /**
     * Returns all the colors of the balls that will perform strategy three when
     * falling into pockets.
     * 
     * @return array of strategy three color strings.
     */
    public static String[] getStrategyThreeColor() {
        return strategyThreeColor;
    }

    /**
     * Returns the map of each ball's score.
     * 
     * @return a map of ball's color to its score.
     */
    public static HashMap<String, Integer> getScoreMap() {
        return scoreMap;
    }

    /**
     * Returns frame rate for this game.
     * 
     * @return frame rate
     */
    public static double getFrameRate() {
        return FRAMERATE;
    }

    /**
     * Returns the buffer around the table.
     * 
     * @return buffer
     */
    public static double getTableBuffer() {
        return TABLEBUFFER;
    }

    /**
     * Returns the edge of the table.
     * 
     * @return edge length.
     */
    public static double getTableEdge() {
        return TABLEEDGE;
    }

    /**
     * Returns the length of cue stick.
     * 
     * @return cue stick length.
     */
    public static double getCueStickLength() {
        return CUESTICKLENGTH;
    }

    /**
     * Returns the config path for easy difficulty.
     * 
     * @return easy config path.
     */
    public static String getEasyConfig() {
        return configPathEasy;
    }

    /**
     * Returns the config path for normal difficulty.
     * 
     * @return normal config path.
     */
    public static String getNormalConfig() {
        return configPathNormal;
    }

    /**
     * Returns the config path for hard difficulty.
     * 
     * @return hard config path.
     */
    public static String getHardConfig() {
        return configPathHard;
    }
}
