package xyz.funtimes909.serverseekerv2.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PlayerTracking {
    public static Map<String, String> playerTracker = new HashMap<>();

    public static void parseList(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }

            JsonArray json = JsonParser.parseString (stringBuilder.toString()).getAsJsonArray();
            for (JsonElement object : json) {
                playerTracker.put(object.getAsJsonObject().get("player").getAsString(), object.getAsJsonObject().get("webhook").getAsString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
