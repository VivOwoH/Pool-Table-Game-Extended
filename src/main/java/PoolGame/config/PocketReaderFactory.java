package PoolGame.config;

public class PocketReaderFactory implements ReaderFactory {
    /**
     * Builds a TableReader.
     * 
     * @return table reader.
     */
    public Reader buildReader() {
        return new PocketReader();
    };
}
