package PoolGame.config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import PoolGame.GameManager;
import PoolGame.objects.Pocket;

/** Reads in pocket section of JSON. */
public class PocketReader implements Reader {
    /**
     * Parses the JSON file and builds the balls.
     * 
     * @param path        The path to the JSON file.
     * @param gameManager The game manager.
     */
    public void parse(String path, GameManager gameManager) {
        JSONParser parser = new JSONParser();
        ArrayList<Pocket> pockets = new ArrayList<Pocket>();

        try {
            Object object = parser.parse(new FileReader(path));

            // convert Object to JSONObject
            JSONObject jsonObject = (JSONObject) object;
            
            // reading the "Table" section:
			JSONObject jsonTable = (JSONObject) jsonObject.get("Table");

            // reading the "Table: pockets" array:
            JSONArray jsonPockets = (JSONArray) jsonTable.get("pockets");

            // reading from the array:
            for (Object obj : jsonPockets) {
                JSONObject jsonPocket = (JSONObject) obj;

                // the ball position, velocity, mass are all doubles
                Double positionX = (Double) ((JSONObject) jsonPocket.get("position")).get("x");
                Double positionY = (Double) ((JSONObject) jsonPocket.get("position")).get("y");

                Double radius = (Double) jsonPocket.get("radius");

                // create the pocket
                pockets.add(new Pocket(positionX, positionY, radius));
            }

            gameManager.getTable().setPockets(pockets);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
