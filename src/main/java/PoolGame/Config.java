package PoolGame;

/** Holds static final data. */
public class Config {
    private static final double TABLEBUFFER = 50;
    private static final double TABLEEDGE = 10;
    private static final String configPathEasy = "src/main/resources/config_easy.json";
    private static final String configPathNormal = "src/main/resources/config_normal.json";
    private static final String configPathHard = "src/main/resources/config_hard.json";

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
