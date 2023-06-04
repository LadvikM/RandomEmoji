package com.example.randomemoji;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import static java.nio.charset.StandardCharsets.UTF_8;


public class EmojiController {


    private static String removeCharacters(String unicodeString) {
        String cleanString = unicodeString.replace("\"", "").replace("[", "").replace("]", "");
        return cleanString;
    }

    private static String removePrefix(String unicodeValue) {
        return unicodeValue.substring(2);
    }

    private static int hexadecimalToDecimal(String codePointString) {
        int codePoint = Integer.parseInt(codePointString, 16);
        return codePoint;
    }

    public ArrayList<String> getEmojis(String link) {

        URL url = null;
        ArrayList<String> emojis = new ArrayList<>();
        try {
             url = new URL(link);
        } catch (MalformedURLException e) {
            emojis.add("☹");
        }

        for (int i = 0; i < 3; i++) {
            String jsonString = null;
            if (url != null) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream(), UTF_8));
                    jsonString = bufferedReader.readLine();
                    bufferedReader.close();


                } catch (IOException e) {
                    emojis.add("☹");
                    return emojis;

                }
            }


            JSONObject jsonObject = new JSONObject(jsonString);
            Object unicode = jsonObject.get("unicode");
            String unicodeString = unicode.toString();
            String cleanString = removeCharacters(unicodeString);

            String[] unicodeValues = cleanString.split(",");

            StringBuilder emojiBuilder = new StringBuilder();
            for (String unicodeValue : unicodeValues) {
                String codePointString = removePrefix(unicodeValue);
                int codePoint = hexadecimalToDecimal(codePointString);
                emojiBuilder.append(new String(Character.toChars(codePoint)));
            }
            String emoji = emojiBuilder.toString();
            emojis.add(emoji);
        }
        return emojis;
    }


}



