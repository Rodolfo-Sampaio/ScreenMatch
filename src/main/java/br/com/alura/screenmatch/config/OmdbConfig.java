package br.com.alura.screenmatch.config;

public class OmdbConfig {
    private static final String OMDB_KEY = System.getenv("OMDB_KEY");

    public static String getOmdbKey() {
        if (OMDB_KEY == null || OMDB_KEY.isEmpty()) {
            throw new IllegalStateException("OMDB API key not configured. Create a key at https://www.omdbapi.com/apikey.aspx. Set an OMDB_KEY environment variable with the generated API Key.");
        }
        return OMDB_KEY;
    }
}
